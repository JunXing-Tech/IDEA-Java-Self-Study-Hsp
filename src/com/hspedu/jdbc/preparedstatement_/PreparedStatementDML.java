package com.hspedu.jdbc.preparedstatement_;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;
import java.util.Scanner;

/**
 * JunXing
 * 2022/12/3 13:08
 * IntelliJ IDEA
 */
public class PreparedStatementDML {
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
        /**
         String sql = "insert into admin values(?, ?)";
         String sql = "update admin set pwd = ? where name = ?";
         String sql = "delete from admin where name = ?"
        */
        String sql = "";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        preparedStatement.setString(1, admin_name);
        preparedStatement.setString(2, admin_sex);

        int i = preparedStatement.executeUpdate();
        System.out.println("i");

        connection.close();
        preparedStatement.close();
    }
}
