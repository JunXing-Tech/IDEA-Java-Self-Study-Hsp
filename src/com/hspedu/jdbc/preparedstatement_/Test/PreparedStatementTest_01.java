package com.hspedu.jdbc.preparedstatement_.Test;

import java.io.FileInputStream;
import java.sql.*;
import java.util.Properties;

/**
 * JunXing
 * 2022/12/3 19:18
 * IntelliJ IDEA
 */
public class PreparedStatementTest_01 {
    public static void main(String[] args) throws Exception{

        Properties properties = new Properties();
        properties.load(new FileInputStream("src\\mysql.properties"));

        String url = properties.getProperty("url");
        String driver = properties.getProperty("driver");
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");

        Class.forName(driver);
        Connection connection = DriverManager.getConnection(url, user, password);

        String s1 = "CREATE TABLE admin("
                + "`id` int unsigned auto_increment,"
                + "name varchar(100) not NULL,"
                + "PRIMARY KEY (`id`)"
                + ")";
        PreparedStatement preparedStatement = connection.prepareStatement(s1);
        int row = preparedStatement.executeUpdate();
        System.out.println(row);

        connection.close();
        preparedStatement.close();
    }
}
