package com.hspedu.jdbc.datasource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.io.FileInputStream;
import java.sql.Connection;
import java.util.Properties;

/**
 * JunXing
 * 2022/12/4 20:14
 * IntelliJ IDEA
 */
public class C3P0_01 {
    public static void main(String[] args) throws Exception{
        //创建数据库连接池对象 new ComboPooledDateSource().var
        ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
        //采用文件数据流的方式载入访问数据 driver url user password
        Properties properties = new Properties();
        properties.load(new FileInputStream("src\\mysql.properties"));
        String driver = properties.getProperty("driver");
        String url = properties.getProperty("url");
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        //给数据源设置相应的数据
        /**
         * 设置数据不要带双引号！！！
         */
        comboPooledDataSource.setDriverClass(driver);
        comboPooledDataSource.setJdbcUrl(url);
        comboPooledDataSource.setUser(user);
        comboPooledDataSource.setPassword(password);
        //设置数据库连接池的初始连接数（最小连接数）和最大连接数
        comboPooledDataSource.setInitialPoolSize(10);
        comboPooledDataSource.setMaxPoolSize(50);
        //用DataSource接口实现数据库的连接，从而达到使用数据库连接池来实现数据库的连接的目的
        Connection connection = comboPooledDataSource.getConnection();
        connection.close();
    }
}
