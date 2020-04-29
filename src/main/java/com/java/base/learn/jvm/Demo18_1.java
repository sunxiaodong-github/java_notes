package com.java.base.learn.jvm;

/**
 * <p>
 *     自定义类加载器
 * </p>
 *
 * @author sunxiaodong
 * @date 2020/4/29 9:30 PM
 */
public class Demo18_1 {

    public static void main(String[] args) throws ClassNotFoundException {
        Demo16 loader = new Demo16("loader");
        loader.setPath("/Users/sunxiaodong/Desktop/");
        Class<?> clazz = loader.loadClass("com.java.base.learn.jvm.Demo1");
        System.out.println(clazz.hashCode());
        System.out.println("class loader: " + clazz.getClassLoader());
    }
}
