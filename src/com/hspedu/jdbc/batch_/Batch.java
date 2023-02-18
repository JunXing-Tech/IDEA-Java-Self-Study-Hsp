package com.hspedu.jdbc.batch_;

import com.hspedu.jdbc.utils.JdbcUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/**
 * JunXing
 * 2022/12/4 16:44
 * IntelliJ IDEA
 */
public class Batch {
    public static void main(String[] args){
        /**
         * 批处理5000条数据耗时784
         * 50000?6131
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
            for (int i = 0; i < 5000; i++) {
                //preparedStatement.setInt(1, i + 1);
                preparedStatement.setString(1, "tom" + i);
                preparedStatement.executeUpdate();
                //preparedStatement.addBatch(); 添加数据到批处理包中
                preparedStatement.addBatch();
                if((i + 1) % 1000 == 0) {
                    //配合preparedStatement.executeBatch()语句配合if语句可达到添加一定数量SQL语句后开始批量执行SQL语句
                    preparedStatement.executeBatch();
                    //preparedStatement.clearBatch()语句将添加的批量执行的SQL语句清空，配合for循环开始添加下一批SQL语句
                    preparedStatement.clearBatch();
                }
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
