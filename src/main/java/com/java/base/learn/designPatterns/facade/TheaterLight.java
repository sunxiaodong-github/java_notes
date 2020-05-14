package com.java.base.learn.designPatterns.facade;

/**
 * <p></p>
 *
 * @author sunxiaodong
 * @date 20-5-14 下午1:36
 **/
public class TheaterLight {
    private static TheaterLight instance = new TheaterLight();

    private TheaterLight(){}

    public static TheaterLight getInstance(){
        return instance;
    }

    public void on(){
        System.out.println("TheaterLight on");
    }

    public void off(){
        System.out.println("TheaterLight off");
    }

    public void dim(){
        System.out.println("TheaterLight dim");
    }

    public void bright(){
        System.out.println("TheaterLight bright");
    }
}
