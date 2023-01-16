/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aprendizaje.test.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author EDDY AQUINO
 */
public class TestConectionMySQL {
    public static void main(String[] args) {
        
        String url = "jdbc:mysql://localhost:3306/test?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
        String user = "root";
        String pass = "java2022";
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, user, pass);
            
            Statement stm = conn.createStatement();
            String sql = "SELECT * FROM usuario";
            ResultSet rs = stm.executeQuery(sql);
            
            while (rs.next()) {
                System.out.println("idUsuario = " + rs.getString("id_usuario"));
                System.out.println("idUsuario = " + rs.getString("username") + "\n");
            }
            
            rs.close();
            stm.close();
            conn.close();
            
        }catch (ClassNotFoundException exc) {
            exc.printStackTrace(System.out);
        } catch (SQLException ex) {
            Logger.getLogger(TestConectionMySQL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
