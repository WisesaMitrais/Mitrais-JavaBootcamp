package utility;

import model.*;

import java.sql.*;
import java.util.*;

public class Database {
    
    private static final String DB_DRIVER = "com.mysql.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://localhost/hackerrankmanage?autoReconnect=true&useSSL=false";
    private static final String DB_USER = "root";
    private static final String DB_PASS = "W!s3s4c0m3c0";
    
    private Connection connection = null;
    private Statement statement = null;
//    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;
    private String sql = null;

    private void openConnection() throws Exception{
        Class.forName(DB_DRIVER);
        connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
    }

    private void closeConnection() throws Exception{
        connection.close();
    }
    
    public List<Category> showAllCategory() throws Exception{
        Category singleResult = null; 
        List<Category> result = new ArrayList<>();
        openConnection();
        statement = connection.createStatement();
        sql = "select * from prob_cat";
        resultSet = statement.executeQuery(sql);
        while(resultSet.next()){
            int idCat = resultSet.getInt("id");
            String nameCat = resultSet.getString("name");
            singleResult = new Category(idCat, nameCat);
            result.add(singleResult);
        }
        resultSet.close();
        statement.close();
        closeConnection();
        return result;
    }
    
    public Category showCategory(String id) throws Exception{
        Category result = null; 
        openConnection();
        statement = connection.createStatement();
        sql = "select * from prob_cat where id = " + Integer.parseInt(id);
        resultSet = statement.executeQuery(sql);
        while(resultSet.next()){
            int idCat = resultSet.getInt("id");
            String nameCat = resultSet.getString("name");
            result = new Category(idCat, nameCat);
        }
        resultSet.close();
        statement.close();
        closeConnection();
        return result;
    }
}
