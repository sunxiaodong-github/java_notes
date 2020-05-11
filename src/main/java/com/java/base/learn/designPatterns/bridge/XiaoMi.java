package com.java.base.learn.designPatterns.bridge;

/**
 * <p></p>
 *
 * @author sunxiaodong
 * @date 20-5-11 下午3:23
 **/
public class XiaoMi implements Brand {

    @Override
    public void open() {
        System.out.println("小米手机开机");
    }

    @Override
    public void close() {
        System.out.println("小米手机关机");
    }

    @Override
    public void call() {
        System.out.println("小米手机打电话");
    }
}
