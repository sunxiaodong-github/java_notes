package com.java.base.learn.designPatterns.facade;

/**
 * <p></p>
 *
 * @author sunxiaodong
 * @date 20-5-14 下午1:30
 **/
public class Projector {

    private static Projector instance = new Projector();

    private Projector(){}

    public static Projector getInstance(){
        return instance;
    }

    public void on(){
        System.out.println("Projector on");
    }

    public void off(){
        System.out.println("Projector off");
    }

    public void project(){
        System.out.println("Projector is Projector");
    }
}
