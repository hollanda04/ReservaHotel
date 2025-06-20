package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Cliente;
import model.Quartos;
import model.Reservas;

public class reservasDAO {
    private Connection connection;

    public reservasDAO(Connection connection) {
        this.connection = connection;
    }

    public String inserirReservas(Reservas reservas) {
        String sql = "INSERT INTO reservas (cpf_cliente, numero_quarto, data_checkIn, data_checkOut, valor_total) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, reservas.getCpfCliente());
            stmt.setInt(2, reservas.getNumeroQuarto());
            stmt.setDate(3, java.sql.Date.valueOf(reservas.getDataCheckIn()));
            stmt.setDate(4, java.sql.Date.valueOf(reservas.getDataCheckOut()));
            stmt.setDouble(5, reservas.getValorTotal());

            stmt.executeUpdate();
            System.out.println("Dados inseridos com sucesso!");
            return "Dados inseridos com sucesso!";
        } catch (SQLException e) {
            String mensagem = "Erro ao inserir dados no banco de dados: " + e.getMessage();
            System.out.println(mensagem);
            return mensagem;
        }
    }

    public List<Reservas> listarReservasCompletas() {
        List<Reservas> reservas = new ArrayList<>();
        String sql = """
            SELECT r.*, c.cpf, c.nome, c.telefone, c.email,
                   q.numero, q.tipo, q.ocupacao, q.valor_diaria
            FROM reservas r
            JOIN clientes c ON r.cpf_cliente = c.cpf
            JOIN quartos q ON r.numero_quarto = q.numero
            """;

        try (PreparedStatement stmt = connection.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Cliente cliente = new Cliente(
                    rs.getString("cpf"),
                    rs.getString("nome"),
                    rs.getString("telefone"),
                    rs.getString("email")
                );

                Quartos quarto = new Quartos(
                    rs.getInt("numero"),
                    rs.getBoolean("ocupacao"),
                    rs.getString("tipo"),
                    rs.getDouble("valor_diaria")
                );

                Reservas reserva = new Reservas(
                    cliente,
                    quarto,
                    rs.getDate("data_checkIn").toLocalDate(),
                    rs.getDate("data_checkOut").toLocalDate(),
                    rs.getDouble("valor_total")
                );
                reservas.add(reserva);
            }

        } catch (SQLException e) {
            System.out.println("Erro ao listar reservas: " + e.getMessage());
        }

        return reservas;
    }

    public Reservas buscarReservaPorCpf(String cpf) {
        String sql = """
            SELECT r.*, c.nome, c.telefone, c.email,
                   q.numero, q.tipo, q.ocupacao, q.valor_diaria
            FROM reservas r
            JOIN clientes c ON r.cpf_cliente = c.cpf
            JOIN quartos q ON r.numero_quarto = q.numero
            WHERE c.cpf = ?
            """;

        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, cpf);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                Cliente cliente = new Cliente(
                    cpf,
                    rs.getString("nome"),
                    rs.getString("telefone"),
                    rs.getString("email")
                );

                Quartos quarto = new Quartos(
                    rs.getInt("numero"),
                    rs.getBoolean("ocupacao"),
                    rs.getString("tipo"),
                    rs.getDouble("valor_diaria")
                );

                return new Reservas(
                    cliente,
                    quarto,
                    rs.getDate("data_checkIn").toLocalDate(),
                    rs.getDate("data_checkOut").toLocalDate(),
                    rs.getDouble("valor_total")
                );
            }

        } catch (SQLException e) {
            System.out.println("Erro ao buscar reserva por CPF: " + e.getMessage());
        }

        return null;
    }

    public void removerReserva(Reservas reserva) {
        String sql = "DELETE FROM reservas WHERE cpf_cliente = ? AND numero_quarto = ?";

        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, reserva.getCpfCliente());
            stmt.setInt(2, reserva.getNumeroQuarto());
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erro ao remover reserva: " + e.getMessage());
        }
    }
}
