package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Quartos;

public class quartosDAO {
    private Connection connection;

    public quartosDAO(Connection connection) {
        this.connection = connection;
    }

    public String inserirQuartos(Quartos quartos) {
        String sql = "INSERT INTO quartos (numero, tipo, ocupacao, valor_diaria) VALUES (?, ?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, quartos.getNumero());
            stmt.setString(2, quartos.getTipo());
            stmt.setBoolean(3, quartos.isOcupado());
            stmt.setDouble(4, quartos.getValorDiaria());

            stmt.executeUpdate();
            System.out.println("Dados inseridos com sucesso!");
            return "Dados inseridos com sucesso!";
        } catch (SQLException e) {
            String mensagem = "Erro ao inserir dados no banco de dados: " + e.getMessage();
            System.out.println(mensagem);
            return mensagem;
        }
    }
     public Quartos buscarPorNumero(int numero) {
        String sql = "SELECT * FROM quartos WHERE numero = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, numero);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return new Quartos(
                    rs.getInt("numero"),
                    rs.getBoolean("status"),
                    rs.getString("tipo"),
                    rs.getDouble("valorDiaria")
                );
            }
        } catch (SQLException e) {
            System.out.println("Erro ao buscar quarto: " + e.getMessage());
        }
        return null;
    }

    public void atualizarStatusOcupado(Quartos quarto) {
        String sql = "UPDATE quartos SET ocupado = ? WHERE numero = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setBoolean(1, quarto.isOcupado());
            stmt.setInt(2, quarto.getNumero());
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erro ao atualizar status do quarto: " + e.getMessage());
        }
    }
}