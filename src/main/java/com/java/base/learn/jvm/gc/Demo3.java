package com.java.base.learn.jvm.gc;

/**
 * <p>
 *     -verbose:gc -Xmx20M -Xms20M -Xmn10M -XX:+PrintGCDetails -XX:+PrintCommandLineFlags -XX:+SurvivorRatio=8 -XX:MaxTenuringThreshold=5 -XX:+PrintTenuringDistribution
 *
 *     MaxTenuringThreshold作用：在可以自动调节对象晋升（Promote）到老年代阈值的GC中，设置该阈值的最大值。该参数的默认值是15，CMS中默认值是6，G1中默认为15（在JVM中，该数值是由4个bit来表示的，所以最大值 1111，即15）
 *     PrintTenuringDistribution作用：经历多次GC后，存活的对象会在From Survivor与 To Survivor之间来回存放，而这里的一个前提则是这个空间有足够的大小来存放这些数据，在GC算法中，
 *     会计算每个对象的年龄大小，如果达到某个年龄后发现总大小已经大于了Survivor空间的50%，那么这时就需要调整阈值，不能再继续等到默认的15次GC后才完成晋升，
 *     因为这样会导致Survivor空间不足，所以需要调整阈值，让这些存活对象尽快完成晋升。
 * </p>
 *
 * @author sunxiaodong
 * @date 20-5-8 上午11:37
 **/
public class Demo3 {

    public static void main(String[] args) {
        int size = 1024 * 1024;
        byte[] alloc1 = new byte[2 * size];
        byte[] alloc2 = new byte[2 * size];
        byte[] alloc3 = new byte[2 * size];
        byte[] alloc4 = new byte[2 * size];
        System.out.println("hello world");
    }
}
