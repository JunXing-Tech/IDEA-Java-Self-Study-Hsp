package com.hspedu.jdbc.datasource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * JunXing
 * 2022/12/5 11:10
 * IntelliJ IDEA
 */
public class JdbcUtilsByDruidUSE {
    public static void main(String[] args) {
        //1.先创建连接 connection
        Connection connection = null;
        //2.编写SQL语句
        String sql = "select * from actor where id = ?";
        //3.接收需处理SQL语句
        PreparedStatement preparedStatement = null;

        ResultSet resultSet = null;
        try {
            //1.
            connection = JdbcUtilsByDruid.getConnection();
            //3.
            preparedStatement = connection.prepareStatement(sql);
            //4.往填入待处理的占位符 ? 中输入相应的值
            preparedStatement.setInt(1, 1);
            //5.返回处理后的结果集
            resultSet = preparedStatement.executeQuery();
            //6.使用while语句遍历输出结果集
            while(resultSet.next()){
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                System.out.println(id + "\t" + name);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            //7.关闭Java程序与数据库连接池的连接资源
            JdbcUtilsByDruid.close(resultSet, preparedStatement, connection);
        }
    }
}
