/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author CAMARGO
 */

import java.sql.*;
import conexao; 
public class Usuários {
    
     private Connection connection;

    
    int CPF;
    String Nome;
    enum Sexo{
        Feminino, Masculino;
    }
    int Idade;
    String Endereço;
    String Email;
    int Telefone;
    String Data_cadastro;
    
            
    public UsuarioDAO(){
       this.connection = new ConnectionFactory().getConnection();
    }
}
