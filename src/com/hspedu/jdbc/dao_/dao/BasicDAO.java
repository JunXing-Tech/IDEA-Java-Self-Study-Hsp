package com.hspedu.jdbc.dao_.dao;


import com.hspedu.jdbc.dao_.utils.JdbcUtilsByDruid;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import java.sql.Connection;
import java.util.List;

/**
 * JunXing
 * 2022/12/9 10:05
 * IntelliJ IDEA
 */
public class BasicDAO<T> {
    /**
     * 1.BasicDAO<T> 使用泛型指定具体类
     * 2.创建QueryRunner类对象 做成 属性
     * 3.开发通用的DML方法，针对任意表
     *      int : 返回受影响的行数，故为int
     *      Object... : 可变参数，可针对不同数量的占位符做出处理
     *      public int update / DML (String sql, Object... parameters){
     *          获取连接 Connection connection = null;
     *          try
     *              connection = JdbcUtilsByDruid.getConnection();
     *              获取受影响的行数, 并返回
     *              int affectedRows = queryRunner.update(connection, sql, parameters);
     *              return affectedRows;
     *          / catch
     *              throw new RuntimeException(e)
     *          / finally
     *              关闭连接
     *              JdbcUtilsByDruid.close(null, null, connection);
     *      }
     */
    private QueryRunner queryRunner = new QueryRunner();

    public int update(String sql, Object... parameters){
        Connection connection = null;
        try {
            connection = JdbcUtilsByDruid.getConnection();
            int affectedRows = queryRunner.update(connection, sql, parameters);
            return affectedRows;
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            JdbcUtilsByDruid.close(null, null, connection);
        }
    }

    /**
     * 查询多行
     * @param sql sql语句
     * @param clazz 传入一个类的Class对象 eg.Actor.class
     * @param parameters 传入 ? 的具体值，可以为多个
     * @return 根据Actor.class 返回对应的 ArrayList 集合
     */
    public List<T> queryMulti(String sql, Class<T> clazz, Object... parameters){

        Connection connection = null;

        try {
            connection = JdbcUtilsByDruid.getConnection();
            return queryRunner.query(connection, sql, new BeanListHandler<T>(clazz), parameters);
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            JdbcUtilsByDruid.close(null, null, connection);
        }
    }

    /**
     * 查询单行结果的通用方法
     */
    public T querySingle(String sql, Class<T> clazz, Object... parameters){
        Connection connection = null;

        try {
            connection = JdbcUtilsByDruid.getConnection();
            return queryRunner.query(connection, sql, new BeanHandler<T>(clazz), parameters);
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            JdbcUtilsByDruid.close(null, null, connection);
        }

    }

    /**
     * 查询单行单列的方法，即返回单值的方法
     */
    public Object queryScalar(String sql, Object... parameters){
        Connection connection = null;

        try {
            connection = JdbcUtilsByDruid.getConnection();
            return queryRunner.query(connection, sql, new ScalarHandler(), parameters);
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            JdbcUtilsByDruid.close(null, null, connection);
        }
    }
}
