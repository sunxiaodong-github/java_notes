package com.java.base.learn.designPatterns.singleton;

/**
 * <p>
 *     单例实现方式 - 懒汉式 【DCL（双重检查）synchronized与volatile结合使用、并双重判断】
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
                if(instance == null){
                    instance = new SingletonLazy();
                }
            }
        }
        return instance;
    }
}
