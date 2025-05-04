package backend_laboratorio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ConexaoMySQL {

    private static final String URL = "jdbc:mysql://localhost:3306/laboratorio?useSSL=false&serverTimezone=UTC";
    private static final String USUARIO = "root";
    private static final String SENHA = "C@iosant0s";

    public static Connection conectar() {
        try {
            Connection conexao = DriverManager.getConnection(URL, USUARIO, SENHA);
            System.out.println("Conexão estabelecida com sucesso!");
            return conexao;
        } catch (SQLException e) {
            System.out.println("Erro ao conectar ao MySQL: " + e.getMessage());
            return null;
        }
    }

    public static void inserir(String nome) {
        Connection conexao = ConexaoMySQL.conectar();

        if (conexao != null) {
            String sql = "INSERT INTO usuarios (nome) VALUES (?)";

            try {
                PreparedStatement stmt = conexao.prepareStatement(sql);
                stmt.setString(1, nome);

                int linhasAfetadas = stmt.executeUpdate();

                if (linhasAfetadas > 0) {
                    System.out.println("Usuário inserido com sucesso!");
                }

                stmt.close();
                conexao.close();
            } catch (SQLException e) {
                System.out.println("Erro ao inserir usuário: " + e.getMessage());
            }
        }
    }
}


