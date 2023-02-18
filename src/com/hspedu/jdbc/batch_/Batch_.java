package com.hspedu.jdbc.batch_;

import com.hspedu.jdbc.utils.JdbcUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * JunXing
 * 2022/12/4 17:30
 * IntelliJ IDEA
 */
public class Batch_ {
    public static void main(String[] args) {
        /**
         * 1.传统方法处理5000条数据耗时730
         * 50000?5763
         */
        Connection connection = null;
        String sql = "insert into admin2 values(null, ?)";
        PreparedStatement preparedStatement = null;
 try {
        connection = JdbcUtils.getConnection();
        connection.setAutoCommit(false);
        preparedStatement = connection.prepareStatement(sql);
        System.out.println("开始执行");
        long start = System.currentTimeMillis();//开始时间
        for (int i = 0; i < 50000; i++) {
        //preparedStatement.setInt(1, i + 1);
        preparedStatement.setString(1, "tom" + i);
        preparedStatement.executeUpdate();
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
        } catch (SQLException e) {
        try {
        connection.rollback();
        } catch (SQLException ex) {
        throw new RuntimeException(ex);
        }
        throw new RuntimeException(e);
        } finally {
        JdbcUtils.close(null, preparedStatement, connection);
        }

    }
}
