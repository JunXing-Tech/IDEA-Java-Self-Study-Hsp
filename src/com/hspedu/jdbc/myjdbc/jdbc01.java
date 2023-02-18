package com.hspedu.jdbc.myjdbc;

import com.mysql.jdbc.Driver;

import java.sql.Connection;
import java.sql.Statement;
import java.util.Properties;

/**
 * JunXing
 * 2022/12/2 20:54
 * IntelliJ IDEA
 */
public class jdbc01 {
    public static void main(String[] args) throws Exception{
        //1.注册驱动
        Driver driver = new Driver();

        //2.得到链接
        String url = "jdbc:mysql://localhost:3306/hsp_db02";

        Properties properties = new Properties();
        properties.setProperty("user", "root");
        properties.setProperty("password", "junxing");

        Connection connect = driver.connect(url, properties);

        //3.执行SQL
        String sql = "insert into actor values(null, 'ldh', '男', '1970-11-11', '110')";

        Statement statement = connect.createStatement();
        int rows = statement.executeUpdate(sql);
        System.out.println(rows > 0 ? "cg" : "sb");
        //4.释放对象
        statement.close();
        connect.close();
    }
}
