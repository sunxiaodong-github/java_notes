package com.java.base.learn.jvm;

import java.time.LocalDateTime;

/**
 * <p></p>
 *
 * @author sunxiaodong
 * @date 2020/4/21 9:58 PM
 */
public class Demo6 {

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        System.out.println("counter1: " + Singleton.counter1);
        System.out.println("counter2: " + Singleton.counter2);
        System.out.println(LocalDateTime.now());
    }
}

class Singleton{
    public static int counter1;
    //public static int counter2 = 0;

    private static Singleton singleton = new Singleton();

    private Singleton(){
        counter1 ++;
        counter2 ++; //准备阶段的重要意义
    }
    public static int counter2 = 0;
    public static Singleton getInstance(){
        return singleton;
    }
}
