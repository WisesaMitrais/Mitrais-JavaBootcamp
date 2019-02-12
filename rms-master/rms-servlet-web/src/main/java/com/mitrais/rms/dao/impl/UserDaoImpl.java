package com.mitrais.rms.dao.impl;

import com.mitrais.rms.dao.DataSourceFactory;
import com.mitrais.rms.dao.UserDao;
import com.mitrais.rms.model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserDaoImpl implements UserDao{

    private final String SQL_FIND;
    private final String SQL_FIND_ALL;
    private final String SQL_SAVE;
    private final String SQL_UPDATE;
    private final String SQL_DELETE;
    private final String SQL_FIND_USER_DATA;
    private Connection conn;
    private PreparedStatement preStmt;
    private ResultSet rs;
    private User user;

    private UserDaoImpl() {
        SQL_FIND = "SELECT * FROM rmsdb.user WHERE id=?";
        SQL_FIND_ALL = "SELECT * FROM rmsdb.user";
        SQL_SAVE = "INSERT INTO user VALUES (NULL, ?, ?)";
        SQL_UPDATE = "UPDATE user SET user_name=?, password=? WHERE id=?";
        SQL_DELETE = "DELETE FROM rmsdb.user WHERE id=?";
        SQL_FIND_USER_DATA = "SELECT * FROM rmsdb.user WHERE user_name=? AND password=?";
    }

    @Override
    public Optional<User> find(Long id){
        try{
            conn = DataSourceFactory.getConnection();
            preStmt = conn.prepareStatement(SQL_FIND);
            preStmt.setLong(1, id);
            rs = preStmt.executeQuery();
            if(rs.next()){
                user = new User(rs.getLong("id"),
                        rs.getString("user_name"),
                        rs.getString("password"));
                return Optional.of(user);
            }
        }catch (SQLException ex){
            ex.printStackTrace();
        }
        return Optional.empty();
    }

    @Override
    public List<User> findAll(){
        List<User> users = new ArrayList<>();
        try{
            conn = DataSourceFactory.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(SQL_FIND_ALL);
            while(rs.next()){
                user = new User(rs.getLong("id"),
                        rs.getString("user_name"),
                        rs.getString("password"));
                users.add(user);
            }
        }catch (SQLException ex){
            ex.printStackTrace();
        }
        return users;
    }

    @Override
    public boolean save(User user){
        try{
            conn = DataSourceFactory.getConnection();
            preStmt = conn.prepareStatement(SQL_SAVE);
            preStmt.setString(1, user.getUserName());
            preStmt.setString(2, user.getPassword());
            int i = preStmt.executeUpdate();
            if(i == 1) {
                return true;
            }
        }catch (SQLException ex){
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean update(User user){
        try{
            conn = DataSourceFactory.getConnection();
            preStmt = conn.prepareStatement(SQL_UPDATE);
            preStmt.setString(1, user.getUserName());
            preStmt.setString(2, user.getPassword());
            preStmt.setLong(3, user.getId());
            int i = preStmt.executeUpdate();
            if(i == 1) {
                return true;
            }
        }catch (SQLException ex){
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean delete(Long id){
        try{
            conn = DataSourceFactory.getConnection();
            preStmt = conn.prepareStatement(SQL_DELETE);
            preStmt.setLong(1, user.getId());
            int i = preStmt.executeUpdate();
            if(i == 1) {
                return true;
            }
        }catch (SQLException ex){
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public Optional<User> findByUserData(String userName, String password){
        try{
            conn = DataSourceFactory.getConnection();
            preStmt = conn.prepareStatement(SQL_FIND_USER_DATA);
            preStmt.setString(1, userName);
            preStmt.setString(2, password);
            rs = preStmt.executeQuery();
            if(rs.next()){
                user = new User(rs.getLong("id"),
                        rs.getString("user_name"),
                        rs.getString("password"));
                return Optional.of(user);
            }
        }catch (SQLException ex){
            ex.printStackTrace();
        }
        return Optional.empty();
    }

    public static UserDao getInstance(){
        return SingletonHelper.INSTANCE;
    }

    private static class SingletonHelper{
        private static final UserDaoImpl INSTANCE = new UserDaoImpl();
    }
}