package com.java.base.learn.jvm;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * <p></p>
 *
 * @author sunxiaodong
 * @date 2020/4/29 10:42 PM
 */
public class Demo20 {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Demo16 loader1 = new Demo16("loader1");
        Demo16 loader2 = new Demo16("loader2");
        //loader1.setPath("/Users/sunxiaodong/Desktop/");
        Class<?> clazz1 = loader1.loadClass("com.java.base.learn.jvm.Person");
        Class<?> clazz2 = loader2.loadClass("com.java.base.learn.jvm.Person");

        System.out.println(clazz1 == clazz2);

        Object instance1 = clazz1.newInstance();
        Object instance2 = clazz2.newInstance();

        Method method = clazz1.getMethod("setPerson", Object.class);
        method.invoke(instance1, instance2);
    }
}
