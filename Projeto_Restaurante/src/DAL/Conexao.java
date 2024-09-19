package DAL;

import java.sql.*;

public class Conexao {

    public static void main(String[] args) {
        java.sql.Connection conexao = null;
        
        // Chamar driver
        String driver = "com.mysql.cj.jdbc.Driver";
        // Armazenando infos do banco
        String url = "jdbc:mysql://127.0.0.1:3306/";
        String user = "root";
        String password = "";
        
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            System.out.println("Conexão estabelecida com sucesso!");
        } catch (Exception e) {
            System.out.println("Erro ao conectar: " + e.getMessage());
        }
    }
}
