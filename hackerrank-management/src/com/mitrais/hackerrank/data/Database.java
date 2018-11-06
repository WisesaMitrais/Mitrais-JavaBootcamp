package com.mitrais.hackerrank.data;

import com.mitrais.hackerrank.*;

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
        System.out.println("Connection opened.");
    }

    private void closeConnection() throws Exception{
        connection.close();
        System.out.println("Connection closed.");
    }

    public void showAllProblems() throws Exception{
        openConnection();
        statement = connection.createStatement();
        sql = "select prob_mod.id as problemID, prob_mod.name as problemName, " +
                "prob_type.type as problemType, prob_type.type_init as typeInitial, " +
                "prob_cat.name as problemCategory, prob_mod.solution as solutionID, " +
                "prob_mod.is_solved as isCompleteSolved " +
                "from prob_mod left join prob_type on prob_mod.type = prob_type.id " +
                "left join prob_cat on prob_mod.category = prob_cat.id";
        resultSet = statement.executeQuery(sql);
        while(resultSet.next()){
            int id = resultSet.getInt("problemID");
            String name = resultSet.getString("problemName");
            String type = resultSet.getString("problemType");
            String typeInit = resultSet.getString("typeInitial");
            String category = resultSet.getString("problemCategory");
            int solution = resultSet.getInt("solutionID");
            boolean solve = resultSet.getBoolean("isCompleteSolved");
            System.out.format(" %1$-8s %2$-58s %3$-28s %4$-8s %5$-23s %6$-10s %7$-8s ",
                    id, name, type, typeInit, category, solution, solve);
            System.out.println();
        }
        resultSet.close();
        statement.close();
        closeConnection();
    }

    public void insertProblemData(List<ProblemModel> problemList, int type, int category) throws Exception{
        openConnection();
        sql = "insert into prob_mod(id, name, type, category, solution, is_solved) values (?, ?, ?, ?, ?, ?)";
        preparedStatement = connection.prepareStatement(sql);
        for(int i = 0; i < problemList.size(); i++){
            preparedStatement.setInt(1, problemList.get(i).getProblemID());
            preparedStatement.setString(2, problemList.get(i).getProblemName());
            preparedStatement.setInt(3, type);
            preparedStatement.setInt(4, category);
            preparedStatement.setInt(5, 99);
            preparedStatement.setBoolean(6, false);
            preparedStatement.execute();
        }
        closeConnection();
    }
}
