package com.java.base.learn.jvm.classloader;

import java.sql.Driver;
import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * <p>
 *     线程上下文类加载器的一般使用模式（获取-使用-还原）
 *     ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
 *     try{
 *         Thread.currentThread().setContextClassLoader(targetTccl);
 *         method();
 *     } finally {
 *         Thread.currentThread().setContextClassLoader(classLoader);
 *     }
 *
 *     method()里面调用Thread.currentThread().getContextClassLoader()，获取当前类加载器做某些事情，
 *     如果一个类由类加载器A加载，那么这个类的依赖类也是由相同的类加载器加载的（如果该依赖类之前没有被加载过的话）
 *     ContextClassLoader的作用就是为了破坏Java的类加载委托机制。
 *
 *     当高层提供了统一的接口让底层去实现，同时又要在高层去加载（或实例化）底层的类时，就必须通过线程上下文加载器来帮助高层的ClassLoader
 *     找到并加载该类
 *
 * </p>
 *
 * @author sunxiaodong
 * @date 2020/5/1 6:02 PM
 */
public class Demo26 {

    public static void main(String[] args) {
        //System.out.println(System.getProperty("java.class.path"));
        //Thread.currentThread().setContextClassLoader(Demo26.class.getClassLoader().getParent());
        ServiceLoader<Driver> serviceLoader = ServiceLoader.load(Driver.class);
        Iterator<Driver> iterator = serviceLoader.iterator();
        while (iterator.hasNext()){
            Driver driver = iterator.next();
            System.out.println("driver: " + driver.getClass() + ", loader: " + driver.getClass().getClassLoader());
        }
        System.out.println("当前线程上下文类加载器：" + Thread.currentThread().getContextClassLoader());
        System.out.println("ServiceLoader的类加载器：" + ServiceLoader.class.getClassLoader());
    }
}
