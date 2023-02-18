package com.hspedu.jdbc.ApDBUtils;

import com.hspedu.jdbc.datasource.JdbcUtilsByDruid;
import org.apache.commons.dbutils.BaseResultSetHandler;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.Connection;
import java.util.List;

/**
 * JunXing
 * 2022/12/8 14:28
 * IntelliJ IDEA
 */
public class ApDBUtilsUse {
    public static void main(String[] args) throws Exception{
        /**
         * Ap-DBUtils + Druid 完成 crud操作
         * 返回多行多列 handler 为 BeanListHandler<>()
         */

        Connection connection = JdbcUtilsByDruid.getConnection();

        QueryRunner queryRunner = new QueryRunner();

        String sql = "select * from actor where id >= ?";

        List<Actor> list = queryRunner.query(connection, sql, new BeanListHandler<>(Actor.class), 1);

        for(Actor actor : list){
            System.out.println(actor);
        }
        
        JdbcUtilsByDruid.close(null, null, connection);
    }
}
