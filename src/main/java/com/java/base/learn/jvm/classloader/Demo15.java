package com.java.base.learn.jvm.classloader;

/**
 * <p></p>
 *
 * @author sunxiaodong
 * @date 20-4-28 上午2:26
 **/
public class Demo15 {

    public static void main(String[] args) {
        // Bootstrap
        String[] strings = new String[2];
        System.out.println(strings.getClass().getClassLoader());

        System.out.println("==============================>");
        // AppClassLoader
        Demo15[] demo15 = new Demo15[2];
        System.out.println(demo15.getClass().getClassLoader());

        System.out.println("==============================>");
        //  if the element type is a primitive type, then the array class has no class loader.
        int[] ints = new int[2];
        System.out.println(ints.getClass().getClassLoader());
    }
}
