package com.example.ws.api_ws_final.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataConfig {
    public static Connection getConnection() throws SQLException {
        Connection connection=null;
        connection= DriverManager.
                getConnection("jdbc:postgresql://localhost:5432/final_ws", "postgres","123456");

        return connection;
    }
}
