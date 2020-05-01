package com.java.base.learn.jvm;

/**
 * <p>
 *     当前类加载器（Current ClassLoader）
 *     每个类都会使用自己的类加载器（即加载自身的类加载器）来去加载其他类（指的是所依赖的类）
 *     如果classX引用了classY，那么classX的类加载器就会去加载classY（前提是classY尚未被加载）
 *
 *     线程上下文类加载器是从JDK1.2开始引入的，类Thread的getContextClassLoader()与setContextClassLoader(ClassLoader cl)
 *     分别用来获取和设置上下文类加载器。
 *
 *     如果没有通过setContextClassLoader(ClassLoader cl)进行设置的话，线程将继承其父线程的上下文类加载器。
 *     Java应用运行时的初始线程的上下文类加载器是系统类加载器，在线程中运行的代码可以通过该类加载器来加载类和资源。
 *
 *     线程上下文类加载器的重要性：
 *     SPI（service provider interface）
 *     父ClassLoader可以使用当前线程Thread.currentThread().getContextClassLoader()所指定的ClassLoader加载的类
 *     这就改变了父ClassLoader不能使用子ClassLoader或是没有直接父子关系的ClassLoader加载的类的情况，即改变了双亲委拖模型。
 *
 *     线程上下文加载器就是当前线程的Current ClassLoader
 *
 *     在双亲委托模型下，类加载器是由下至上的，即下层的类加载器会委托上层进行加载。但是对于SPI来说，有些接口是Java核心库所提供的，而
 *     Java核心库是由启动类加载器来加载的，而这些接口的实现却来自不同的jar包（厂商提供），Java的启动类加载器是不会加载其他来源的jar包，
 *     这样传统的双亲委托模型是无法满足SPI的要求。而通过给当前线程设置上下文类加载器，就可以由设置的上下文类加载器来实现对于接口的实现类的加载。
 * </p>
 *
 * @author sunxiaodong
 * @date 2020/5/1 3:50 PM
 */
public class Demo24 {

    public static void main(String[] args) {
        // 系统类加载器
        System.out.println(Thread.currentThread().getContextClassLoader());
        // 启动类加载器
        System.out.println(Thread.class.getClassLoader());
    }
}
