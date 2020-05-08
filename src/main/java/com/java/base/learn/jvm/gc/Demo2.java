package com.java.base.learn.jvm.gc;

/**
 * <p>
 *     JVM默认参数：java -XX:+PrintCommandLineFlags -version
 *     PretenureSizeThreshold：设置对象超过多大时直接在老年代进行分配
 * </p>
 *
 * @author sunxiaodong
 * @date 2020/5/7 11:52 PM
 */
public class Demo2 {

    public static void main(String[] args) {
        // -verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8 -XX:PretenureSizeThreshold=4194304 -XX:+UseSerialGC
        int size = 1024 * 1024;
        byte[] alloc = new byte[5 * size];

        try {
            Thread.sleep(1000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("hello world");
    }
}
