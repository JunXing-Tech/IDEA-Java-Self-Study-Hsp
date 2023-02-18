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
 * 2022/12/2 23:19
 * IntelliJ IDEA
 */
public class JdbcConnTest {
    public static void main(String[] args) throws IOException, SQLException {
        Properties properties = new Properties();
        properties.load(new FileInputStream("src\\mysql.properties"));

        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        String url = properties.getProperty("url");
        String driver = properties.getProperty("driver");

        Connection connection = DriverManager.getConnection(url, user, password);

        String sql01 = "insert into actor values(null, 'jack', '男', '2000-1-1', '111')";

        Statement statement = connection.createStatement();

        int i = statement.executeUpdate(sql01);

        System.out.println(i);
    }
}
