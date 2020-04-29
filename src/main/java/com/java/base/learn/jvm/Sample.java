package com.java.base.learn.jvm;

/**
 * <p></p>
 *
 * @author sunxiaodong
 * @date 20-4-29 下午4:49
 **/
public class Sample {

    public Sample() {
        System.out.println("sample is loaded by: " + this.getClass().getClassLoader());
        new Cat();
        // 子类加载器所加载的类命名空间中可以访问父类加载器的类
        System.out.println("form cat: " + Cat.class);
    }
}
