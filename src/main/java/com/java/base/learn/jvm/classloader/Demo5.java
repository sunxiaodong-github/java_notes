package com.java.base.learn.jvm.classloader;

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
        //System.out.println(Child5.b);
        System.out.println(Parent5_1.THREAD);
    }
}
interface Grandpa5 {
    public static final Thread THREAD = new Thread(){
        {
            System.out.println("grandpa5 invoked!!!");
        }
    };
}
interface Parent5 extends Grandpa5 {
    //public static final int a = 4;
    public static final Thread THREAD = new Thread(){
        {
            System.out.println("parent5 invoked!!!");
        }
    };
}
class Child5 implements Parent5 {
    //public static final int b = new Random().nextInt();
    //public static final int b = 5;
    public static int b = 5;
}
interface Grandpa5_1 {
    public static final Thread THREAD = new Thread(){
        {
            System.out.println("grandpa5_1 invoked!!!");
        }
    };
}
interface Parent5_1 extends Grandpa5_1 {
    public static final Thread THREAD = new Thread(){
        {
            System.out.println("parent5_1 invoked!!!");
        }
    };
}