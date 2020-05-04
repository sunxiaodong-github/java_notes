package com.java.base.learn.jvm.bytecode;

/**
 * <p></p>
 *
 * @author sunxiaodong
 * @date 2020/5/4 1:07 PM
 */
public class Demo2 {

    String str = "welcome";

    private int x = 5;

    public static Integer in = 10;

    public static void main(String[] args) {
        Demo2 demo2 = new Demo2();
        demo2.setX(8);
        in = 20;
    }

    private synchronized void setX(int x) {
        this.x = x;
    }

    private void test(String str){
        synchronized (str){
            System.out.println("hello world!");
        }
    }

    private synchronized static void test2(){}
}
