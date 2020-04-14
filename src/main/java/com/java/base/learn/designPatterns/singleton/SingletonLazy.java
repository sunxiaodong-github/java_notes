package com.java.base.learn.designPatterns.singleton;

/**
 * <p>
 * DCL（双重锁检测机制）synchronized与volatile结合使用
 * </p>
 *
 * @author sunxiaodong
 * @date 20-4-13 下午9:30
 **/
public class SingletonLazy {

    private volatile static SingletonLazy instance;

    private SingletonLazy() {
    }

    public static SingletonLazy getInstance() {
        if (instance == null) {
            synchronized (instance.getClass()) {
                instance = new SingletonLazy();
            }
        }
        return instance;
    }
}
