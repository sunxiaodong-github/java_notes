package com.java.base.learn.jvm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * <p></p>
 *
 * @author sunxiaodong
 * @date 2020/5/1 11:08 PM
 */
public class Demo27 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test1?useSSL=false", "root", "admin");
        System.out.println(connection);
        connection.close();
    }
}
