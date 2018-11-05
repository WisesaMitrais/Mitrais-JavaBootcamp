package com.mitrais.hackerrank.data;

import java.sql.*;

public class Database {

    public static final String DB_DRIVER = "com.mysql.jdbc.Driver";
    public static final String DB_URL = "jdbc:mysql://localhost/hackerrankmanage";
    public static final String DB_USER = "root";
    public static final String DB_PASS = "W!s3s4c0m3c0";

    public Connection connection = null;
    public Statement statement = null;
    public ResultSet resultSet = null;
    public String sql = null;

    public void showAllTables() throws SQLException, Exception{
        Class.forName(DB_DRIVER);
        connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
        System.out.println("Connection opened.");
        statement = connection.createStatement();
        sql = "select * from prob_cat";
        resultSet = statement.executeQuery(sql);
        while(resultSet.next()){
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            System.out.println(id + " - " + name);
        }
        resultSet.close();
        statement.close();
        connection.close();
        System.out.println("Connection Closed.");
    }
}
