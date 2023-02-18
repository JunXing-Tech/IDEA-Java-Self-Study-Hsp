package com.hspedu.jdbc.statement_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;
import java.util.Scanner;

/**
 * JunXing
 * 2022/12/3 10:38
 * IntelliJ IDEA
 */
public class Statement_ {
    public static void main(String[] args) throws IOException, SQLException, ClassNotFoundException {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input manager name,please.");
        String admin_name = scanner.nextLine();
        System.out.print("Input manager password,please.");
        String admin_pwd = scanner.nextLine();

        Properties properties = new Properties();
        properties.load(new FileInputStream("src\\mysql.properties"));
        String driver = properties.getProperty("driver");
        String url = properties.getProperty("url");
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");

        Class.forName(driver);
        Connection connection = DriverManager.getConnection(url, user, password);
        System.out.println(connection);
        Statement statement = connection.createStatement();

        String sql = "select name, pwd from admin where name = '"+ admin_name +"' and pwd = '"+ admin_pwd+"'";
        ResultSet resultSet = statement.executeQuery(sql);
        if(resultSet.next()){
            System.out.println("success!");
        }else{
            System.out.println("failure!");
        }

        resultSet.close();
        connection.close();
        statement.close();
    }
}
