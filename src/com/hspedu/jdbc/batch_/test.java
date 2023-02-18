package com.hspedu.jdbc.batch_;

import com.hspedu.jdbc.utils.JdbcUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 * JunXing
 * 2022/12/4 17:35
 * IntelliJ IDEA
 */
public class test {//344
    public static void main(String[] args) throws Exception{
            Connection connection = JdbcUtils.getConnection();
            String sql = "insert into admin2 values(null, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            System.out.println("开始执行");
            long start = System.currentTimeMillis();//开始时间
            for (int i = 0; i < 50000; i++) {//5000 执行
                preparedStatement.setString(1, "tom" + i);
                //preparedStatement.setString(2, "666");
                preparedStatement.addBatch();
                if((i + 1) % 10000 == 0) {//满 1000 条 sql
                    preparedStatement.executeBatch();
                    preparedStatement.clearBatch();
                }
            }
            long end = System.currentTimeMillis();
            System.out.println("批量方式 耗时=" + (end - start));//批量方式 耗时=108
            JdbcUtils.close(null, preparedStatement, connection);
        }
    }


