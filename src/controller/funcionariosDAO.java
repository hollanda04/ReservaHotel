package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Funcionario;

public class funcionariosDAO {
    private Connection connection;

    public funcionariosDAO(Connection connection) {
        this.connection = connection;
    }

    public String inserirFuncionario(Funcionario funcionario) {
        String sql = "INSERT INTO funcionarios (nome, cargo, login, senha) VALUES (?, ?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, funcionario.getNome());
            stmt.setString(2, funcionario.getCargo());
            stmt.setString(3, funcionario.getLogin());
            stmt.setString(4, funcionario.getSenha());

            stmt.executeUpdate();
            System.out.println("Dados inseridos com sucesso!");
            return "Dados inseridos com sucesso!";
        } catch (SQLException e) {
            String mensagem = "Erro ao inserir dados no banco de dados: " + e.getMessage();
            System.out.println(mensagem);
            return mensagem;
        }
    }
}