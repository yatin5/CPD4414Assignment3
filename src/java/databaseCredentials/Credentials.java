/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databaseCredentials;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author YATIN PATEL
 */
public class Credentials {
    
    /**
     * Provides a Connection to the Xampp "c0648442" DataBase
     * Created connection in getConnection Method
     * Created product Table in dataBase
     * @return the connection object or null if a connection failed
     * @throws SQLException
     */
    public static Connection getConnection() throws SQLException {
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String jdbc = "jdbc:mysql://localhost/c0654874";
            String user = "root";
            String pass = "";
            conn = DriverManager.getConnection(jdbc, user, pass);
            String query = "SELECT * FROM product";

        } catch (ClassNotFoundException | SQLException ex) {
            System.err.println("No class found Exception" + ex.getMessage());
        }
        return conn;
    }
    
}
