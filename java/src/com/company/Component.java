package com.company;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Component
{
    String url = "jdbc:mongodb://atlas-sql-64d84a2f9a070c29cf72d0ef-rbmt2.a.query.mongodb.net/sample_airbnb?ssl=true&authSource=admin";

    public boolean tryConnection() throws Exception{
        Connection connection = DriverManager.getConnection(url);
        boolean isValid = connection.isValid(2);
        return isValid;
    }

//    String query = "db.sampleCollection().find()";
//    Statement statement = con.createStatement();
//    ResultSet rs = statement.executeQuery( query );
//    Object json = rs.getObject(1);

//    String query = "sample_airbnb.listingsAndReviews";
//    Statement statement = Connection.createStatement();
}
