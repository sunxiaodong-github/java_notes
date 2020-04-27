package com.java.base.learn.jvm;

/**
 * <p></p>
 *
 * @author sunxiaodong
 * @date 2020/4/27 10:44 PM
 */
public class Demo8 {

    public static void main(String[] args) {
        System.out.println(FinalTest.x);
    }
}

class FinalTest {
    public static final int x = 3;
    //public static final int x = new Random().nextInt(4);
    //public static int x = 3;

    static {
        System.out.println("finalTest static block");
    }
}
