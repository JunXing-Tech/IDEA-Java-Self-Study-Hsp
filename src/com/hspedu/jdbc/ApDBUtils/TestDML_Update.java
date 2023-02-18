package com.hspedu.jdbc.ApDBUtils;

import com.hspedu.jdbc.datasource.JdbcUtilsByDruid;
import org.apache.commons.dbutils.QueryRunner;

import java.sql.Connection;

/**
 * JunXing
 * 2022/12/8 21:24
 * IntelliJ IDEA
 */
public class TestDML_Update {
    public static void main(String[] args) throws Exception{
        Connection connection = JdbcUtilsByDruid.getConnection();
        QueryRunner queryRunner = new QueryRunner();
        String sql = "update actor set name = ? where id = ?";
        int affectedRow = queryRunner.update(connection, sql, "ccc", 1);
        /**
         * 可根据执行后的影响行数来进行判断 判断语句
         */
        JdbcUtilsByDruid.close(null, null, connection);
    }
}
