package com.java.base.learn.jvm;

import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;

/**
 * <p>
 *     获取当前类的ClassLoader： clazz.getClassLoader()
 *     获取当前线程上下文的ClassLoader： Thread.currentThread().getContextClassLoader()
 *     获得系统的ClassLoader： ClassLoader.getSystemClassLoader()
 *     获得调用者的ClassLoader： DriverManager.getCallerClassLoader()
 * </p>
 *
 * @author sunxiaodong
 * @date 20-4-28 上午12:06
 **/
public class Demo14 {

    public static void main(String[] args) throws IOException {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        String resourceName = "com/java/base/learn/jvm/Demo13.class";
        Enumeration<URL> urls = classLoader.getResources(resourceName);
        while (urls.hasMoreElements()){
            URL url = urls.nextElement();
            System.out.println(url);
        }
        System.out.println("=====================>");
        Class<?> clazz = Demo14.class;
        System.out.println(clazz.getClassLoader());
    }
}
