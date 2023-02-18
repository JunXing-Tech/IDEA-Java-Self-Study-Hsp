package com.hspedu.jdbc.preparedstatement_;

import java.io.FileInputStream;
import java.sql.*;
import java.util.Properties;
import java.util.Scanner;

/**
 * JunXing
 * 2022/12/3 13:08
 * IntelliJ IDEA
 */
public class PreparedStatement_ {
    /**
     * 演示PreparedStatement
     */
    public static void main(String[] args) throws Exception{

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input manager name,please.");
        String admin_name = scanner.nextLine();
        System.out.print("Input manager password,please.");
        String admin_sex = scanner.nextLine();

        Properties properties = new Properties();
        properties.load(new FileInputStream("src\\mysql.properties"));
        String driver = properties.getProperty("driver");
        String url = properties.getProperty("url");
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");

        Class.forName(driver);
        Connection connection = DriverManager.getConnection(url, user, password);

        String sql = "select name, sex from actor where name = ? and sex = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, admin_name);
        preparedStatement.setString(2, admin_sex);
        ResultSet resultSet = preparedStatement.executeQuery();

        if(resultSet.next()){
            System.out.println("success");
        }else{
            System.out.println("failure");
        }

        connection.close();
        preparedStatement.close();
        resultSet.close();
    }
}
