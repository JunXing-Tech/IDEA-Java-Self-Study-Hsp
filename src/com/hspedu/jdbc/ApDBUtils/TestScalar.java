package com.hspedu.jdbc.ApDBUtils;

import com.hspedu.jdbc.datasource.JdbcUtilsByDruid;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import java.sql.Connection;

/**
 * JunXing
 * 2022/12/8 21:13
 * IntelliJ IDEA
 */
public class TestScalar {
    public static void main(String[] args) throws Exception{
        /**
         * 返回单行单列
         * PS:因为返回的是一个对象（单行单列），使用的 handler 为 ScalarHandler()
         */
        Connection connection = JdbcUtilsByDruid.getConnection();

        QueryRunner queryRunner = new QueryRunner();

        String sql = "select name from actor where id = ?";

        Object query = queryRunner.query(connection, sql, new ScalarHandler<>(), 2);

        System.out.println(query);

        JdbcUtilsByDruid.close(null, null, connection);
    }
}
