package com.java.base.learn.designPatterns.facade;

/**
 * <p></p>
 *
 * @author sunxiaodong
 * @date 20-5-14 下午1:38
 **/
public class Client {

    public static void main(String[] args) {
        // 直接调用，很麻烦
        // 使用外观类
        HomeTheaterFacade facade = new HomeTheaterFacade();
        facade.ready();
        facade.play();
        facade.pause();
        facade.end();
    }
}
