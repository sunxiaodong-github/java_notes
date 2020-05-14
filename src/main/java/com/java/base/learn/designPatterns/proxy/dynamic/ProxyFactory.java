package com.java.base.learn.designPatterns.proxy.dynamic;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * <p></p>
 *
 * @author sunxiaodong
 * @date 20-5-14 下午5:27
 **/
public class ProxyFactory {

    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    public Object getProxyInstance() {
        System.out.println(target.getClass().getClassLoader());
        Object proxyInstance = Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), (Object proxy, Method method, Object[] args) -> {
            System.out.println("JDK代理开始...");
            Object invoke = method.invoke(target, args);
            System.out.println("JDK代理提交...");
            return invoke;
        });
        return proxyInstance;
    }
}
