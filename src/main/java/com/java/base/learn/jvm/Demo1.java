package com.java.base.learn.jvm;

/**
 * <p>
 *     对于静态字段来说，只有直接定义了该字段才会被初始化；
 *     当一个类在初始化时，要求其父类都已经初始化完毕了。
 *     -XX:+TraceClassLoading，用于追踪类的加载信息并打印出来
 *
 *     -XX:+<option>，表示要开启option选项
 *     -XX:-<option>，标识关闭option选项
 *     -XX:<option>=<value>表示将option选项的值设置为value
 * </p>
 *
 * @author sunxiaodong
 * @date 20-4-21 下午1:56
 **/
public class Demo1 {

    public static void main(String[] args) {
        System.out.println(Child1.str);
        /** 输出：Parent1 static block welcome */
        //System.out.println(Child1.str2);
        /** 输出：Parent1 static block Child static block welcome */
    }
}

class Parent1 {
    public static String str = "hello world!";

    static {
        System.out.println("Parent1 static block");
    }
}

class Child1 extends Parent1 {
    public static String str2 = "welcome";

    static {
        System.out.println("Child static block");
    }
}