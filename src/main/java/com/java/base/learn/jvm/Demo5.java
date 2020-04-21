package com.java.base.learn.jvm;

import java.util.Random;

/**
 * <p>
 *     当一个接口在初始化时，并不是要求其父接口都完成了初始化
 *     只有在真正使用到父接口的时候（如引用接口中所定义的常量时），才会初始化。
 * </p>
 *
 * @author sunxiaodong
 * @date 20-4-21 上午5:04
 **/
public class Demo5 {

    public static void main(String[] args) {
        System.out.println(Child5.b);
    }
}
interface Parent5 {
    public static final int a = new Random().nextInt(3);
}
interface Child5 extends Parent5 {
    public static final int b = new Random().nextInt(4);
}