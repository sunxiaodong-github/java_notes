package com.java.base.learn.designPatterns.facade;

/**
 * <p></p>
 *
 * @author sunxiaodong
 * @date 20-5-14 下午1:28
 **/
public class Popcorn {
    private static Popcorn instance = new Popcorn();

    private Popcorn(){}

    public static Popcorn getInstance(){
        return instance;
    }

    public void on(){
        System.out.println("Popcorn on");
    }

    public void off(){
        System.out.println("Popcorn off");
    }

    public void pop(){
        System.out.println("Popcorn poping");
    }
}
