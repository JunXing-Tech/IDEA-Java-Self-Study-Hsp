package com.hspedu.jdbc.ApDBUtils;

import com.hspedu.jdbc.datasource.JdbcUtilsByDruid;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
/**
 * JunXing
 * 2022/12/7 10:40
 * IntelliJ IDEA
 */
public class TestSelectToArrayList {
    public static void main(String[] args) {
        TestSelectToArrayList testSelectToArrayList = new TestSelectToArrayList();
        testSelectToArrayList.testSelectToArrayList();
        /**
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        String sql = "select * from actor";
        ResultSet resultSet = null;
        //创建 ArrayList 对象,存放 actor 对象
        ArrayList<Actor> list = new ArrayList<>();
        try {
            connection= JdbcUtilsByDruid.getConnection();
            connection.setAutoCommit(false);
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            connection.commit();
            while(resultSet.next()){
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String sex = resultSet.getString("sex");
                Date borndate = resultSet.getDate("borndate");
                String phone = resultSet.getString("phone");
                //把得到的resultset的记录，封装到Actor对象，放入到list集合
                list.add(new Actor(id, name, sex, borndate, phone));
            }
        } catch (SQLException e) {
            try {
                connection.rollback();
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
            throw new RuntimeException(e);
        } finally {
            JdbcUtilsByDruid.close(resultSet, preparedStatement, connection);
        }
        System.out.println(list);
         */

    }

    public ArrayList<Actor> testSelectToArrayList() {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        String sql = "select * from actor";
        ResultSet resultSet = null;
        //创建 ArrayList 对象,存放 actor 对象
        ArrayList<Actor> list = new ArrayList<>();
        try {
            connection = JdbcUtilsByDruid.getConnection();
            connection.setAutoCommit(false);
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            connection.commit();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String sex = resultSet.getString("sex");
                Date borndate = resultSet.getDate("borndate");
                String phone = resultSet.getString("phone");
                //把得到的resultset的记录，封装到Actor对象，放入到list集合
                list.add(new Actor(id, name, sex, borndate, phone));
            }
        } catch (SQLException e) {
            try {
                connection.rollback();
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
            throw new RuntimeException(e);
        } finally {
            JdbcUtilsByDruid.close(resultSet, preparedStatement, connection);
        }
        System.out.println(list);

        return list;
    }
}
