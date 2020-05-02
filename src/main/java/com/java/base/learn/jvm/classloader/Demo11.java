package com.java.base.learn.jvm.classloader;

/**
 * <p></p>
 *
 * @author sunxiaodong
 * @date 2020/4/28 12:39 AM
 */
public class Demo11 {

    public static void main(String[] args) {
        // 子类调用父类的方法属性，是对父类的主动使用
        System.out.println(Child11.a);
        System.out.println("=======================>");
        Child11.doSomething();
    }
}

class Parent11 {
    static int a = 3;

    static {
        System.out.println("Parent11 static block");
    }

    static void doSomething(){
        System.out.println("do something");
    }
}
class Child11 extends Parent11 {
    static {
        System.out.println("child11 static block");
    }
}
