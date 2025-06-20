package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Cliente;

public class clienteDAO {
    private Connection connection;

    public clienteDAO(Connection connection) {
        this.connection = connection;
    }

    public String inserirCliente(Cliente cliente) {
        String sql = "INSERT INTO cliente (nome, cpf, telefone, email) VALUES (?, ?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getCpf());
            stmt.setString(3, cliente.getTelefone());
            stmt.setString(4, cliente.getEmail());

            stmt.executeUpdate();
            System.out.println("Dados inseridos com sucesso!");
            return "Dados inseridos com sucesso!";
        } catch (SQLException e) {
            String mensagem = "Erro ao inserir dados no banco de dados: " + e.getMessage();
            System.out.println(mensagem);
            return mensagem;
        }
    }

    public Cliente buscarPorId(int id) {
        String sql = "SELECT id_cliente, nome, cpf, telefone, email FROM cliente WHERE id_cliente = ?"; // Adicionado id_cliente na SELECT
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                // Se a classe Cliente tiver um construtor que aceita ID, use-o.
                // Caso contrário, crie o objeto e use setters.
                Cliente cliente = new Cliente(
                    rs.getString("cpf"),
                    rs.getString("email"),
                    rs.getString("nome"),
                    rs.getString("telefone")
                );
                // Assumindo que Cliente tem um setId() se o construtor não o incluir
                cliente.setId(rs.getInt("id_cliente")); // Adicione isso se Cliente tiver um campo 'id'
                return cliente;
            }
        } catch (SQLException e) {
            System.out.println("Erro ao buscar cliente por ID: " + e.getMessage());
        }
        return null;
    }

    public Cliente buscarPorCpf(String cpf) {
        String sql = "SELECT id_cliente, nome, cpf, telefone, email FROM cliente WHERE cpf = ?"; // Adicionado id_cliente na SELECT
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, cpf);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                Cliente cliente = new Cliente(
                    rs.getString("cpf"),
                    rs.getString("email"),
                    rs.getString("nome"),
                    rs.getString("telefone")
                );
                cliente.setId(rs.getInt("id_cliente")); // Adicione isso se Cliente tiver um campo 'id'
                return cliente;
            }
        } catch (SQLException e) {
            System.out.println("Erro ao buscar cliente por CPF: " + e.getMessage());
        }
        return null;
    }

    public String excluirClientePorId(int id) {
        String sql = "DELETE FROM cliente WHERE id_cliente = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            int linhasAfetadas = stmt.executeUpdate();

            if (linhasAfetadas > 0) {
                String mensagem = "Cliente com ID " + id + " foi excluído com sucesso!";
                System.out.println(mensagem);
                return mensagem;
            } else {
                String mensagem = "Nenhum cliente encontrado com o ID " + id + ".";
                System.out.println(mensagem);
                return mensagem;
            }
        } catch (SQLException e) {
            String mensagem = "Erro ao excluir cliente: " + e.getMessage();
            System.out.println(mensagem);
            return mensagem;
        }
    }

    // --- NOVO MÉTODO DE UPDATE ---
    /**
     * Atualiza os dados de um cliente existente no banco de dados.
     * O cliente a ser atualizado é identificado pelo seu ID.
     *
     * @param cliente O objeto Cliente contendo os novos dados e o ID para identificação.
     * @return Uma mensagem indicando o status da operação (sucesso ou erro).
     */
    public String atualizarCliente(Cliente cliente) {
        // A query SQL UPDATE para modificar nome, cpf, telefone e email,
        // usando o id_cliente como condição (WHERE)
        String sql = "UPDATE cliente SET nome = ?, cpf = ?, telefone = ?, email = ? WHERE id_cliente = ?";

        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            // Define os parâmetros da query com os novos valores
            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getCpf());
            stmt.setString(3, cliente.getTelefone());
            stmt.setString(4, cliente.getEmail());
            stmt.setInt(5, cliente.getId()); // O ID é usado para identificar qual registro atualizar

            // Executa a atualização e obtém o número de linhas afetadas
            int linhasAfetadas = stmt.executeUpdate();

            // Verifica se a atualização foi bem-sucedida (pelo menos uma linha afetada)
            if (linhasAfetadas > 0) {
                String mensagem = "Cliente com ID " + cliente.getId() + " atualizado com sucesso!";
                System.out.println(mensagem);
                return mensagem;
            } else {
                // Se nenhuma linha foi afetada, provavelmente o ID do cliente não foi encontrado
                String mensagem = "Nenhum cliente encontrado com o ID " + cliente.getId() + " para ser atualizado.";
                System.out.println(mensagem);
                return mensagem;
            }
        } catch (SQLException e) {
            // Captura e trata exceções SQL que possam ocorrer
            String mensagem = "Erro ao atualizar cliente: " + e.getMessage();
            System.out.println(mensagem);
            return mensagem;
        }
    } 

    public List<Cliente> listarTodos() {
        String sql = "SELECT id_cliente, nome, cpf, telefone, email FROM cliente ORDER BY nome";
        List<Cliente> clientes = new ArrayList<>(); // Cria uma lista vazia para armazenar os clientes

        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            ResultSet rs = stmt.executeQuery();

            // Itera sobre o resultado da consulta
            while (rs.next()) {
                // Cria um objeto Cliente para cada linha retornada
                Cliente cliente = new Cliente(
                    rs.getString("cpf"),
                    rs.getString("email"),
                    rs.getString("nome"),
                    rs.getString("telefone")
                );
                // Define o ID do cliente
                cliente.setId(rs.getInt("id_cliente"));

                // Adiciona o cliente na lista
                clientes.add(cliente);
            }
        } catch (SQLException e) {
            // Em caso de erro, imprime o erro no console e retorna uma lista vazia
            System.out.println("Erro ao listar todos os clientes: " + e.getMessage());
            e.printStackTrace();
        }
        
        return clientes; // Retorna a lista de clientes (pode estar vazia)
    }

   
}


