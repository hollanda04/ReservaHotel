package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Pagamentos;

public class pagamentosDAO {
    private Connection connection;

    public pagamentosDAO(Connection connection) {
        this.connection = connection;
    }

    public String inserirPagamentos(Pagamentos pagamentos) {
        String sql = "INSERT INTO pagamentos (valor, data_pagamento, metodo) VALUES (?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setDouble(1, pagamentos.getValor());
            stmt.setString(2, pagamentos.getDataPagamento());
            stmt.setString(3, pagamentos.getMetodoPagamento()); 

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