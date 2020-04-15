package com.java.base.learn.designPatterns.singleton;

/**
 * <p>
 *     单例实现方式 - 静态内部类
 * </p>
 *
 * @author sunxiaodong
 * @date 2020/4/14 9:27 PM
 */
public class SingletonStaticInnerClass {

    private SingletonStaticInnerClass() {
    }

    private static class SingletonInstance{
        private static final SingletonStaticInnerClass INSTANCE = new SingletonStaticInnerClass();
    }

    public static SingletonStaticInnerClass getINstance(){
        return SingletonInstance.INSTANCE;
    }
}
