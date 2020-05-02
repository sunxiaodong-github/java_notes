package com.java.base.learn.jvm.classloader;

/**
 * <p></p>
 *
 * @author sunxiaodong
 * @date 2020/4/28 12:48 AM
 */
public class Demo12 {

    public static void main(String[] args) throws ClassNotFoundException {
        ClassLoader loader = ClassLoader.getSystemClassLoader();
        // 调用ClassLoader的loadClass方法加载一个类，并不是对类的主动使用，不会导致类的初始化
        Class<?> clazz = loader.loadClass("com.java.base.learn.jvm.classloader.CL");
        System.out.println(clazz);
        System.out.println("==================>");
        // 调用反射会初始化类
        clazz = Class.forName("com.java.base.learn.jvm.classloader.CL");
        System.out.println(clazz);
    }
}

class CL {
    static {
        System.out.println("CL static block");
    }
}