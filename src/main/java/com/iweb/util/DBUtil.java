package com.iweb.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author MA
 * @date 2023/6/11 14:17
 */
public class DBUtil {
    private static final String URL="jdbc:mysql://localhost:3306/staff?characterEncoding=utf-8";
    private static final String USERNAME ="root";
    private static final String PASSWORD ="123456";

    static {
        try {
            Class.forName("com.mysql.jdbc.Driver" );
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    //获取连接
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL,USERNAME,PASSWORD);
    }
}