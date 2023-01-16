/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aprendizaje.test.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author EDDY AQUINO
 */
public class ConexionJDBC {
    
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/test?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASS = "java2022";
    
    public static Connection getConnection(){
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASS);
        } catch (SQLException ex) {
            Logger.getLogger(ConexionJDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
    }
    
    public static void close(ResultSet rs) throws SQLException{
        rs.close();
    }
    
    public static void close(Statement stm) throws SQLException{
        stm.close();
    }
    
    public static void close(PreparedStatement pstm) throws SQLException{
        pstm.close();
    }
    
    public static void close(Connection conn) throws SQLException{
        conn.close();
    }
    
}
