package org.example;

import java.sql.*;

public class DBConnection {
    public static Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/college";
        return DriverManager.getConnection(url, "root", "root");
    }
}
