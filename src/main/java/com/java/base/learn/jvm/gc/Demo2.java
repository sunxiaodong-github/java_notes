package com.java.base.learn.jvm.gc;

/**
 * <p>
 *     JVM默认参数：java -XX:+PrintCommandLineFlags -version
 *
 * </p>
 *
 * @author sunxiaodong
 * @date 2020/5/7 11:52 PM
 */
public class Demo2 {

    public static void main(String[] args) {
        // -verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8 -XX:PretenureSizeThreshold=4194304
        int size = 1024 * 1024;
        byte[] alloc = new byte[5 * size];

        System.out.println("hello world");
    }
}
