package com.java.base.learn.jvm;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Enumeration;

/**
 * <p>
 *     获取ClassLoader的途径：
     *     获得当前类的ClassLoader：clazz.getClassLoader();
     *     获得当前线程上下文的ClassLoader：Thread.currentThread().getContextClassLoader()
     *     获得系统的ClassLoader：ClassLoader.getSystemClassLoader()
     *     获得调用者的ClassLoader：DriverManager.getCallerClassLoader()
 * </p>
 *
 * @author sunxiaodong
 * @date 2020/5/1 11:08 PM
 */
public class Demo27 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://47.100.238.213:3306/test1?useSSL=false", "root", "admin");
        System.out.println(connection);
        connection.close();

        // 当一个类或者一个资源文件存在多个jar中，就会存在jar hell问题，可以同过以下代码诊断问题：
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        String reourceName = "java/lang/String.class";
        Enumeration<URL> urlEnumeration = classLoader.getResources(reourceName);
        while (urlEnumeration.hasMoreElements()){
            URL url = urlEnumeration.nextElement();
            System.out.println(url);
        }

    }
}
