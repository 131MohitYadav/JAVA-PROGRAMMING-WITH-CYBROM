/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ram.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConnectionPool {

    static Connection conn;

    public static Connection connectDB() {
        try {
            //step1: Register the Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            //step2: Create the connection
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jan13", "root", "Ram@1234");
            System.out.println("Database Connection success");

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConnectionPool.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionPool.class.getName()).log(Level.SEVERE, null, ex);
        }

        return conn;
    }
    public static void main(String[] args) {
        connectDB();
    }
}
