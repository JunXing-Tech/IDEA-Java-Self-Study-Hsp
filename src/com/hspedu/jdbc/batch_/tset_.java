package com.hspedu.jdbc.batch_;

import com.hspedu.jdbc.utils.JdbcUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 * JunXing
 * 2022/12/4 17:38
 * IntelliJ IDEA
 */
public class tset_ {//9274
    public static void main(String[] args) throws Exception{
        Connection connection = JdbcUtils.getConnection();
        String sql = "insert into admin2 values(null, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        System.out.println("开始执行");
        long start = System.currentTimeMillis();//开始时间
        for (int i = 0; i < 5000; i++) {//5000 执行
            preparedStatement.setString(1, "tom" + i);
            //preparedStatement.setString(2, "666");
            preparedStatement.executeUpdate();
        }
        long end = System.currentTimeMillis();
        System.out.println("传统的方式 耗时=" + (end - start));//传统的方式 耗时=10702
        JdbcUtils.close(null, preparedStatement, connection);
    }
}
