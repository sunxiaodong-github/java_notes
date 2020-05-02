package com.java.base.learn.jvm.classloader;

/**
 * <p>
 *     类加载器运用
 * </p>
 *
 * @author sunxiaodong
 * @date 2020/4/27 10:31 PM
 */
public class Demo7 {

    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> clazz = Class.forName("java.lang.String");
        System.out.println(clazz.getClassLoader());

        Class<?> clazz2 = Class.forName("com.java.base.learn.jvm.classloader.C");
        System.out.println(clazz2.getClassLoader());
    }
}

class C {

}
