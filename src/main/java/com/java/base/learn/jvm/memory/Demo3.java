package com.java.base.learn.jvm.memory;

/**
 * <p>线程死锁分析工具：jvisualvm</p>
 *
 * @author sunxiaodong
 * @date 20-5-6 上午10:39
 **/
public class Demo3 {

    public static void main(String[] args) {
        new Thread(() -> A.test(), "threadA").start();
        new Thread(() -> B.test(), "threadB").start();
    }
}

class A {

    public synchronized static void test(){
        System.out.println("method A");
        try {
            Thread.sleep(400);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        B.test();
    }
}

class B {
    public synchronized static void test(){
        System.out.println("method B");
        try {
            Thread.sleep(400);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        A.test();
    }
}
