package com.java.base.learn.jvm;

/**
 * <p>
 *     助记符：
 *          ldc：表示将int、float或者是String类型的常量值从常量池中推送至栈顶
 *          bipush：表示将单个字节（-128~127）的常量值推送至栈顶
 *          sipush：表示将一个短整型的常量值（-32768 ~ 32767）推送到栈顶
 *          iconst_1：表示将int类型i推送至栈顶（iconst_m1 - iconst_5）
 * </p>
 *
 * @author sunxiaodong
 * @date 20-4-21 上午2:24
 **/
public class Demo2 {

    public static void main(String[] args) {
        System.out.println(Parent2.bipush);
    }
}

class Parent2 {

    /**
     * final：常量在编译阶段常量就会被存入到调用这个常量的方法所在的类的常量池中，
     * 本质上，调用类并没有直接引用到定义常量的类，因此并不会触发定义常量的类的初始化。
     * 注意：这里指的是将常量放到Demo2的常量池中，之后Demo2与Parent2就没有任何关系了；甚至，我们可以将Parent2的class文件删除。
     */
    public static final String str = "hello world";
    public static String str2 = "hello world";
    public static final short s = 127;
    public static final int i = -1;
    public static final int iconst_1 = 1;
    public static final int bipush = 6;

    static {
        System.out.println("Parent2 static block");
    }
}