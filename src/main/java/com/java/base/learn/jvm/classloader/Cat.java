package com.java.base.learn.jvm.classloader;

/**
 * <p></p>
 *
 * @author sunxiaodong
 * @date 20-4-29 下午4:46
 **/
public class Cat {

    public Cat(){
        System.out.println("Cat is loaded by: " + this.getClass().getClassLoader());
        // 父加载器无法找到子加载器的类 类加载器的名称空间
        //System.out.println("from Cat: " + Sample.class);
    }
}
