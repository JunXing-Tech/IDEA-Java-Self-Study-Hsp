package com.hspedu.jdbc.utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * JunXing
 * 2022/12/3 21:30
 * IntelliJ IDEA
 */
public class JdbcUtilsUse{
    public static void main(String[] args){

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        String sql = "select * from admin";
        ResultSet resultSet = null;
        try {
            connection = JdbcUtils.getConnection();
            preparedStatement = connection.prepareStatement(sql);
            resultSet= preparedStatement.executeQuery();
            while(resultSet.next()){
                int id = resultSet.getInt("id");
                String name = resultSet.getNString("name");
                System.out.println(id + "\t" + name);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            JdbcUtils.close(resultSet, preparedStatement, connection);
        }
    }
}
