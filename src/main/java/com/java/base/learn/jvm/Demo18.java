package com.java.base.learn.jvm;

/**
 * <p>
 *     获取跟加载器加载目录、扩展类加载器目录、系统（应用程序）类加载器目录
 * </p>
 *
 * @author sunxiaodong
 * @date 2020/4/29 8:32 PM
 */
public class Demo18 {

    public static void main(String[] args) {
        System.out.println(System.getProperty("sun.boot.class.path"));
        System.out.println(System.getProperty("java.ext.dirs"));
        System.out.println(System.getProperty("java.class.path"));
    }
}
