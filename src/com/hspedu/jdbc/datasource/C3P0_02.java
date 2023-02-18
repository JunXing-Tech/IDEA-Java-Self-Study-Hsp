package com.hspedu.jdbc.datasource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.sql.Connection;

/**
 * JunXing
 * 2022/12/4 21:08
 * IntelliJ IDEA
 */
public class C3P0_02 {
    public static void main(String[] args) throws Exception{
        ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource("JunXing");
        Connection connection = comboPooledDataSource.getConnection();
        connection.close();
    }
}
