package logic;

import bean.*;

import java.sql.*;
import java.util.*;

public class Database {
    
    private static final String DB_DRIVER = "com.mysql.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://localhost/hackerrankmanage?autoReconnect=true&useSSL=false";
    private static final String DB_USER = "root";
    private static final String DB_PASS = "W!s3s4c0m3c0";
    
    private Connection connection = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;
    private String sql = null;

    private void openConnection() throws Exception{
        Class.forName(DB_DRIVER);
        connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
    }

    private void closeConnection() throws Exception{
        resultSet.close();
        statement.close();
        connection.close();
    }
    
    public int getLastIDProblem() throws Exception{
        int result = -1;
        openConnection();
        statement = connection.createStatement();
        sql = "select max(id) as lastID from prob_type";
        resultSet = statement.executeQuery(sql);
        while(resultSet.next()){
            result = resultSet.getInt("lastID");
        }
        closeConnection();
        return result;
    }
    
    public void postNewProblem(String type, String init) throws Exception{
        int lastID = getLastIDProblem();
        lastID++;
        sql = "insert into prob_type(id, type, type_init) values (?, ?, ?)";
        openConnection();
        preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, lastID);
        preparedStatement.setString(2, type);
        preparedStatement.setString(3, init);
        preparedStatement.execute();
        closeConnection();
    }
    
    public List<Problem> getAllProblem() throws Exception{
        Problem singleResult; 
        List<Problem> result = new ArrayList<>();
        openConnection();
        statement = connection.createStatement();
        sql = "select prob_mod.id as 'problemID', "
                + "prob_mod.name as 'problemName', "
                + "prob_type.type as 'problemType', "
                + "prob_type.type_init as 'typeInitial', "
                + "prob_cat.name as 'problemCategory', "
                + "prob_mod.solution as 'solutionID', "
                + "prob_mod.is_solved as 'isCompleteSolved' "
                + "from prob_mod left join prob_type "
                + "on prob_mod.type = prob_type.id "
                + "left join prob_cat on prob_mod.category = prob_cat.id;";
        resultSet = statement.executeQuery(sql);
        while(resultSet.next()){
            int pID = resultSet.getInt("problemID");
            String pName = resultSet.getString("problemName");
            String pType = resultSet.getString("problemType");
            String tInit = resultSet.getString("typeInitial");
            String pCat = resultSet.getString("problemCategory");
            int sID = resultSet.getInt("solutionID");
            boolean pStat = resultSet.getBoolean("isCompleteSolved");
            singleResult = new Problem(pID, pName, pType, tInit, pCat, sID, pStat);
            result.add(singleResult);
        }
        closeConnection();
        return result;
    }
}
