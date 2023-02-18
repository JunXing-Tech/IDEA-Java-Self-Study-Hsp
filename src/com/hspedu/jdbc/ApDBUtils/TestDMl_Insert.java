package com.hspedu.jdbc.ApDBUtils;

import com.hspedu.jdbc.datasource.JdbcUtilsByDruid;
import org.apache.commons.dbutils.QueryRunner;

import java.sql.Connection;

/**
 * JunXing
 * 2022/12/8 21:31
 * IntelliJ IDEA
 */
public class TestDMl_Insert {
    public static void main(String[] args) throws Exception{
        Connection connection = JdbcUtilsByDruid.getConnection();
        QueryRunner queryRunner = new QueryRunner();
        /**
         * queryRunner.update() 可以执行SQL语句的 update insert delete 操作
         */
        String sql = "insert into actor values(null, ?, ?, ?, ?)";
        Object insert = queryRunner.update(connection, sql, "ddd", "无", "1111-11-11", "111");

        JdbcUtilsByDruid.close(null, null, connection);
    }
}
