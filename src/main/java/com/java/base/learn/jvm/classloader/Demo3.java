package com.java.base.learn.jvm.classloader;

import java.util.UUID;

/**
 * <p>
 *     当一个常量的值并非编译期间可以确定的，那么其值就不会被放到调用了类的常量池中，
 *     这时在程序运行时，会导致主动使用这个常量所在的类，显然会导致这个类初始化。
 * </p>
 *
 * @author sunxiaodong
 * @date 20-4-21 上午4:22
 **/
public class Demo3 {

    public static void main(String[] args) {
        System.out.println(Parent3.UUIDS);
    }
}

class Parent3 {
    public static final String UUIDS = UUID.randomUUID().toString();

    static {
        System.out.println("parent3 static block");
    }
}
