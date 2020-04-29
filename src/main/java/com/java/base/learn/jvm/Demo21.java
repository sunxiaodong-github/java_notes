package com.java.base.learn.jvm;

import java.lang.reflect.Method;

/**
 * <p>
 *     同一个命名空间内的类是相互可见的
 *     子加载器的命名空间包含所有父加载器的命名空间。因此由子加载器加载的类能看见父加载器加载的类。例如系统类加载器加载的类能看见根加载器加载的类
 *     由父加载器加载的类不能看见子类加载器加载的类
 *     如果两个加载器之间没有直接或间接的父子关系，那么它们各自加载的类相互不可见
 * </p>
 *
 * @author sunxiaodong
 * @date 2020/4/29 11:31 PM
 */
public class Demo21 {

    public static void main(String[] args) throws Exception {
        Demo16 loader1 = new Demo16("loader1");
        Demo16 loader2 = new Demo16("loader2");
        loader1.setPath("/Users/sunxiaodong/Desktop/");
        loader2.setPath("/Users/sunxiaodong/Desktop/");
        Class<?> clazz1 = loader1.loadClass("com.java.base.learn.jvm.Person");
        Class<?> clazz2 = loader2.loadClass("com.java.base.learn.jvm.Person");

        System.out.println(clazz1 == clazz2);

        Object instance1 = clazz1.newInstance();
        Object instance2 = clazz2.newInstance();

        Method method = clazz1.getMethod("setPerson", Object.class);
        method.invoke(instance1, instance2);
    }
}
