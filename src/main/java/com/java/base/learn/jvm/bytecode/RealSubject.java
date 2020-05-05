package com.java.base.learn.jvm.bytecode;

/**
 * <p></p>
 *
 * @author sunxiaodong
 * @date 2020/5/5 3:19 PM
 */
public class RealSubject implements Subject {

    @Override
    public void request() {
        System.out.println("from realSubject");
    }
}
