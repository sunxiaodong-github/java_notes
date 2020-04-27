package com.java.base.learn.jvm;

/**
 * <p></p>
 *
 * @author sunxiaodong
 * @date 2020/4/27 11:29 PM
 */
public class Demo9 {

    static {
        System.out.println("demo9 static block");
    }

    public static void main(String[] args) {
        System.out.println(Child9.b);
    }
}

class Parent9 {
    static int a = 3;

    static {
        System.out.println("parent static block");
    }
}

class Child9 extends Parent9 {
    static int b = 4;

    static {
        System.out.println("child static block");
    }
}