package com.hspedu.jdbc.ApDBUtils;

import com.hspedu.jdbc.datasource.JdbcUtilsByDruid;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

/**
 * JunXing
 * 2022/12/8 20:44
 * IntelliJ IDEA
 */
public class TestQuerySingle {
    public static void main(String[] args){
        /**
         * 1. 通过Druid连接池获得数据库连接
         * 2. 创建QueryRunner对象
         * 3. SQL语句
         * 4. queryRunner.query(connection, sql, new BeanHandler<>(表类.class), 占位符数)
         * PS: 因为返回的是单个整列记录 --- 单个对象，所以使用的 Handler 为 BeanHandler
         * 5.单个记录查询完毕 sout
         * 6.释放资源是要注意 ApDBUtils 是在底层自动关闭 result 和 statement 所以只需要关闭 connection
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("输入需查询的ID号：");
        int ID = scanner.nextInt();

        Connection connection = null;
        Actor actor = null;
        try {
            connection = JdbcUtilsByDruid.getConnection();

            connection.setAutoCommit(false);

            QueryRunner queryRunner = new QueryRunner();

            String sql = "select * from actor where id = ?";

            actor = queryRunner.query(connection, sql, new BeanHandler<>(Actor.class), ID);

            if(actor != null){
                System.out.println(actor);
            }else{
                System.out.println("无ID为" + ID + "的信息");
            }
        } catch (SQLException e) {
            try {
                connection.rollback();
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
            throw new RuntimeException(e);
        } finally {
            JdbcUtilsByDruid.close(null, null, connection);
        }
    }
}
