package com.java.base.learn.designPatterns.bridge;

/**
 * <p></p>
 *
 * @author sunxiaodong
 * @date 20-5-11 下午3:24
 **/
public class Vivo implements Brand {

    @Override
    public void open() {
        System.out.println("Vivo 手机开机");
    }

    @Override
    public void close() {
        System.out.println("Vivo 手机关机");
    }

    @Override
    public void call() {
        System.out.println("Vivo 手机打电话");
    }
}
