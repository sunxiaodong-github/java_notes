package com.java.base.learn.jvm;

/**
 * <p>
 *     当一个接口在初始化时，并不是要求其父接口都完成了初始化
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
    public static int a = 5;
}
interface Child5 extends Parent5 {
    public static int b = 6;
}