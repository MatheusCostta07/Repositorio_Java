/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projeto_restaurante;

/**
 *
 * @author CAMARGO
 */
import java.sql.*;

public class conexao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    java.sql.Connection conexao = null;
        
        //chamar driver
        String driver = "com.mysql.jdbc.Driver";
        //Armazenando infos do banco
        String url = "jdbc:mysql://localhost:3306";
        String user = "root";
        String password = "";
        
         try {
            Class.forName(driver);
            conexao = DriverManager.getConnection("jdbc:mysql://localhost/restaurante", "root", "");
        } catch (Exception e) {
            System.out.println(e);
        }
    
    }
    
}
