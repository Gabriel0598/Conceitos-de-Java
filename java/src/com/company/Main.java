package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello World!");
    }

    String url = "jdbc:mongodb://atlas-sql-64d84a2f9a070c29cf72d0ef-rbmt2.a.query.mongodb.net/sample_airbnb?ssl=true&authSource=admin";

    public boolean tryConnection() throws Exception{
        Connection connection = DriverManager.getConnection(url);
        boolean isValid = connection.isValid(2);
        return isValid;
    }

    public String query() throws SQLException
    {
        String query1 = "SHOW DATABASES;";
        Connection connection = DriverManager.getConnection(url);
        String query = String.valueOf(connection.createStatement());
        return query;
    }
}
