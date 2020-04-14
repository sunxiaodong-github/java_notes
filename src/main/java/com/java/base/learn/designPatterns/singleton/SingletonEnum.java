package com.java.base.learn.designPatterns.singleton;

/**
 * <p>
 *     单例实现方式 - 枚举形式
 *     不仅能避免多线程同步问题，而且还能防止反序列化重新创建新的对象
 * </p>
 *
 * @author sunxiaodong
 * @date 2020/4/14 10:03 PM
 */
public class SingletonEnum {

    public static void main(String[] args) {
        Singleton instance = Singleton.INSTANCE;
        instance.say();
    }

    enum Singleton{
        INSTANCE;

        public void say(){

        }
    }
}
