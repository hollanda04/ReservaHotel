package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    // Constantes com as informações de conexão.
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/cadastro_hotel"; // <-- MUDE AQUI
    private static final String USER = "root";
    private static final String PASS = "admin"; // <-- MUDE AQUI se sua senha for diferente

    /**
     * Obtém uma nova conexão com o banco de dados.
     * @return Um objeto Connection com a conexão estabelecida.
     * @throws SQLException Se a conexão falhar.
     */
    public static Connection getConnection() throws SQLException {
        try {
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (ClassNotFoundException e) {
            // Lança uma exceção se o driver do MySQL não for encontrado.
            throw new SQLException("Driver JDBC não encontrado.", e);
        }
    }
}