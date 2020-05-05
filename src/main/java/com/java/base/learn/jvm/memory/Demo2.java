package com.java.base.learn.jvm.memory;

/**
 * <p>
 *     虚拟机栈溢出 java.lang.StackOverflowError
 * </p>
 *
 * @author sunxiaodong
 * @date 2020/5/6 12:07 AM
 */
public class Demo2 {

    private int length;

    public int getLength() {
        return length;
    }

    public void test() {
        this.length++;
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        test();
    }

    public static void main(String[] args) {
        // -Xss160k
        Demo2 demo2 = new Demo2();
        try {
            demo2.test();
        }catch (Throwable ex){
            System.out.println(demo2.length);
            ex.printStackTrace();
        }
    }
}
