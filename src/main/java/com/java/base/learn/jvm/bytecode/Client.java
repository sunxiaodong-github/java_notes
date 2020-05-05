package com.java.base.learn.jvm.bytecode;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * <p></p>
 *
 * @author sunxiaodong
 * @date 2020/5/5 3:25 PM
 */
public class Client {

    public static void main(String[] args) {
        // ProxyGenerator.saveGeneratedFiles
        //System.setProperty("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        RealSubject realSubject = new RealSubject();
        InvocationHandler handler = new DynamicSubject(realSubject);
        Class<?> clazz = realSubject.getClass();
        Subject subject = (Subject) Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), handler);
        subject.request();
        System.out.println(subject.getClass());
        System.out.println(subject.getClass().getSuperclass());
    }
}
