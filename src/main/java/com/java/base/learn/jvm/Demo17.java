package com.java.base.learn.jvm;

/**
 * <p></p>
 *
 * @author sunxiaodong
 * @date 20-4-29 下午4:51
 **/
public class Demo17 {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Demo16 loader1 = new Demo16("loader1");
        loader1.setPath("/home/sunxiaodong/Desktop/");
        Class<?> clazz = loader1.loadClass("com.java.base.learn.jvm.Sample");
        System.out.println("clazz: " + clazz.hashCode());
        Object instance = clazz.newInstance();
    }
}
