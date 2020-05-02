package com.java.base.learn.jvm.classloader;

/**
 * <p></p>
 *
 * @author sunxiaodong
 * @date 20-4-29 上午10:18
 **/
public class Demo22 {

    static {
        System.out.println("Demo22 initializer");
    }

    public static void main(String[] args) {
        System.out.println(Demo22.class.getClassLoader());
        System.out.println(Demo1.class.getClassLoader());
    }
}
