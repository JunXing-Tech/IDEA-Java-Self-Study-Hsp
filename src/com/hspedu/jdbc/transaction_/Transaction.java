package com.hspedu.jdbc.transaction_;

import com.hspedu.jdbc.utils.JdbcUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

/**
 * JunXing
 * 2022/12/4 15:41
 * IntelliJ IDEA
 */

public class Transaction {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("dim user num id");
        double bal_dim_num = scanner.nextInt();
        int bal_dim_id = scanner.nextInt();

        System.out.println("add user id:");
        int bal_add_id = scanner.nextInt();

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        String sql_dim = "update account set balance = balance - ? where id = ?";
        String sql_add = "update account set balance = balance + ? where id = ?";
        try {
             connection= JdbcUtils.getConnection();
            /**
             * connection.setAutoCommit(false); 开启事务，手动提交事务
             */
            connection.setAutoCommit(false);
            /**
             * preparedStatement= connection.prepareStatement(sql_add);
             * preparedStatement.executeUpdate();
             * 这两条语句可执行一条sql语句，若想再执行一条sql语句，则再使用以上两条语句，记得改相应参数
             */
             preparedStatement= connection.prepareStatement(sql_dim);
             preparedStatement.setDouble(1, bal_dim_num);
             preparedStatement.setInt(2, bal_dim_id);
             preparedStatement.executeUpdate();

             preparedStatement = connection.prepareStatement(sql_add);
             preparedStatement.setDouble(1, bal_dim_num);
             preparedStatement.setInt(2, bal_add_id);
             preparedStatement.executeUpdate();

            /**
             * 若sql完全执行正确，则提交事务
             */
             connection.commit();
        } catch (SQLException e) {
            try {
                /**
                 * 事务回滚
                 */
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
