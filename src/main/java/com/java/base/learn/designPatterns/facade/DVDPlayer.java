package com.java.base.learn.designPatterns.facade;

/**
 * <p></p>
 *
 * @author sunxiaodong
 * @date 20-5-14 下午1:26
 **/
public class DVDPlayer {

    private static DVDPlayer instance = new DVDPlayer();

    private DVDPlayer(){}

    public static DVDPlayer getInstance(){
        return instance;
    }

    public void on(){
        System.out.println("DVD on");
    }

    public void off(){
        System.out.println("DVD off");
    }

    public void play(){
        System.out.println("DVD is playing");
    }

    public void pause(){
        System.out.println("DVD pause");
    }
}
