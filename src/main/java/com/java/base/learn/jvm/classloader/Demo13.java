package com.java.base.learn.jvm.classloader;

/**
 * <p></p>
 *
 * @author sunxiaodong
 * @date 20-4-27 下午10:13
 **/
public class Demo13 {

    public static void main(String[] args) {
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        System.out.println(classLoader);

        while (null != classLoader){
            classLoader = classLoader.getParent();
            System.out.println(classLoader);
        }
    }
}
