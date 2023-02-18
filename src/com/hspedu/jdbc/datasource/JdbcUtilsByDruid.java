package com.hspedu.jdbc.datasource;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * JunXing
 * 2022/12/5 10:58
 * IntelliJ IDEA
 */
public class JdbcUtilsByDruid {
    //定义数据源属性
    private static DataSource dataSource;

    //静态代码块完成dataSource初始化
    static{
        //用properties载入数据
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream("src\\druid.properties"));
            //使用DruidDataSourceFactory.createDataSource(properties);
            dataSource = DruidDataSourceFactory.createDataSource(properties);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    //编写 getConnection 方法
    public static Connection getConnection() throws SQLException {
        return dataSource.getConnection();
    }

    /**
     * 关闭连接,在数据库连接池技术中，close不是真的断掉连接而是把使用的Connection
     */
    public static void close(ResultSet resultSet, Statement statement, Connection connection) {
        try {
             if (resultSet != null) {
                 resultSet.close();
             }
             if (statement != null) {
                 statement.close();
             }
             if (connection != null) {
                 connection.close();
             }
        }catch (SQLException e) {
             throw new RuntimeException(e);
        }
    }
}
