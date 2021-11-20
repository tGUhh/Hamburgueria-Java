/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hamburgueriabanconew;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Snp
 */
public class Conexao {
    
    private static String status = "Não conectado...";
    
    private static String serverName, database, url, username, password;
    
    private static Connection connection = null;
    private static Statement state;
    
    public Conexao(){
        serverName = "localhost:5432";
        database = "hamburgueria";
        url = "jdbc:postgres://" + serverName + "/" + database;
        username = "postgres";
        password = "postgres";
    }

    public static Statement getConexao() {
        
        String driverName = "com.postgresql.cj.jdbc.Driver";
        
        try{
            Class.forName(driverName);
            
            connection = DriverManager.getConnection(url, username, password);
            state = connection.createStatement();
            if(connection != null){
                
                status = ("STATUS: Conectado com sucesso!");
            
            }else{
                
                status = ("STATUS: Não foi possivel realizar conexão");
                        
            }
                
        } catch (ClassNotFoundException ex) {
            
                System.out.println("o driver especificado não foi encontrado.");
                
                return null;
                
        } catch (SQLException ex) {
            
            System.out.println("Não foi possivel conectar ao banco de Dados.");
                
                return null;
        }
        return null;
        
    }
    
 
    
    public static boolean fecharConexao(){
    
        try{
            
            Conexao.getConexao().close();
            
            return true;
            
        } catch (SQLException e){
        
        return false;        
       
    }
   
   }   
    
}
