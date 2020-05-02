package com.java.base.learn.jvm.classloader;

/**
 * <p></p>
 *
 * @author sunxiaodong
 * @date 2020/4/28 12:02 AM
 */
public class Demo10 {

    static {
        System.out.println("demo10 static block");
    }

    public static void main(String[] args) {
        Parent10 parent10;
        System.out.println("==========================>");
        parent10 = new Parent10();
        System.out.println("==========================>");
        System.out.println(parent10.a);
        System.out.println("==========================>");
        System.out.println(Child10.b);
    }
}

class Parent10 {
    static int a = 3;

    static {
        System.out.println("parent10 static block");
    }
}

class Child10 extends Parent10 {
    static int b = 5;

    static {
        System.out.println("child10 static block");
    }
}
