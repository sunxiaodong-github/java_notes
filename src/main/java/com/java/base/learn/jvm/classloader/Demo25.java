package com.java.base.learn.jvm.classloader;

/**
 * <p></p>
 *
 * @author sunxiaodong
 * @date 2020/5/1 5:30 PM
 */
public class Demo25 implements Runnable {

    private Thread thread;

    public Demo25() {
     thread = new Thread(this);
     thread.start();
    }

    @Override
    public void run() {
        ClassLoader classLoader = this.thread.getContextClassLoader();

        this.thread.setContextClassLoader(classLoader);

        System.out.println("class: " + classLoader.getClass());
        System.out.println("parent:" + classLoader.getParent().getClass());
    }

    public static void main(String[] args) {
        new Demo25();
    }
}
