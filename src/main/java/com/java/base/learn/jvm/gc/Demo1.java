package com.java.base.learn.jvm.gc;

/**
 * <p>
 *     PSYoungGen：Parallel Scavenge（新生代垃圾收集器）
 *     ParOldGen：Parallel Old（老年代垃圾收集器）
 * </p>
 *
 * @author sunxiaodong
 * @date 20-5-7 下午4:37
 **/
public class Demo1 {

    public static void main(String[] args) {
        // -verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8
        int size = 1024 * 1024;
        byte[] alloc1 = new byte[2 * size];
        byte[] alloc2 = new byte[2 * size];
        byte[] alloc3 = new byte[3 * size];
        byte[] alloc4 = new byte[3 * size];
        System.out.println("hello world");
    }
}
