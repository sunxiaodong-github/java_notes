package com.java.base.learn.jvm.gc;

/**
 * <p>
 *     -verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8 -XX:+UseConcMarkSweepGC
 *
 *     UseConcMarkSweepGC用于老年代
 * </p>
 *
 * @author sunxiaodong
 * @date 20-5-8 下午4:20
 **/
public class Demo5 {

    public static void main(String[] args) {
        int size = 1024 * 1024;

        byte[] alloc1 = new byte[4 * size];
        System.out.println("1111111111111111");

        byte[] alloc2 = new byte[4 * size];
        System.out.println("22222222222222222");

        byte[] alloc3 = new byte[4 * size];
        System.out.println("33333333333333");

        byte[] alloc4 = new byte[2 * size];
        System.out.println("44444444444444");

        System.out.println("hello world");
    }
}
