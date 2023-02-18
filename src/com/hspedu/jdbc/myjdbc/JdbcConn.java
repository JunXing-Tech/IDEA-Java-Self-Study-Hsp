package com.hspedu.jdbc.myjdbc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * JunXing
 * 2022/12/2 21:16
 * IntelliJ IDEA
 */
public class JdbcConn {
    /**
     * 推荐方式
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
        /*Class.forName("com.mysql.jdbc.Driver");

        String url = "jdbc:mysql//1270.0.1:3306/hsp_db02";
        String user = "root";
        String password = "junxing";
        Connection connection = DriverManager.getConnection(url, user, password);

        String sql = "";

        Statement statement = connection.createStatement();
        int i = statement.executeUpdate(sql);
        System.out.println(i);*/

        Properties properties = new Properties();
        properties.load(new FileInputStream("src\\mysql.properties"));

        String driver = properties.getProperty("driver");
        String url = properties.getProperty("url");
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");

        Class.forName(driver);

        Connection connection = DriverManager.getConnection(url, user, password);

        System.out.println(connection);

    }
}
