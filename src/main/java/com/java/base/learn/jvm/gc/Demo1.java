package com.java.base.learn.jvm.gc;

/**
 * <p></p>
 *
 * @author sunxiaodong
 * @date 20-5-7 下午4:37
 **/
public class Demo1 {

    public static void main(String[] args) {
        int size = 1024 * 1024;
        byte[] alloc1 = new byte[2 * size];
        byte[] alloc2 = new byte[2 * size];
        byte[] alloc3 = new byte[3 * size];
        //byte[] alloc4 = new byte[2 * size];
        System.out.println("hello world");
    }
}
