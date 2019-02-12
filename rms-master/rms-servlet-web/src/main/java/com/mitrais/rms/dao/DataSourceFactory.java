package com.mitrais.rms.dao;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class DataSourceFactory{

    private final DataSource dataSource;

    public DataSourceFactory(){
        MysqlDataSource mysqlDataSource = new MysqlDataSource();
        mysqlDataSource.setDatabaseName("rmsdb");
        mysqlDataSource.setServerName("localhost");
        mysqlDataSource.setPort(3306);
        mysqlDataSource.setUser("root");
        mysqlDataSource.setPassword("W!s3s4c0m3c0");
        this.dataSource = mysqlDataSource;
    }

    public static Connection getConnection() throws SQLException{
        return SingletonHelper.INSTANCE.dataSource.getConnection();
    }

    private static class SingletonHelper{
        private static final DataSourceFactory INSTANCE = new DataSourceFactory();
    }
}
