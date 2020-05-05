package com.java.base.learn.jvm.memory;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 *     虚拟机栈：Stack Frame 栈帧
 *     程序计数器（Program Counter）
 *     本地方法栈：主要用于处理本地方法
 *     堆（Heap）：JVM管理的最大一块内存空间，与堆相关的一个重要概念是垃圾收集器。现代几乎所有的垃圾收集器都是采用分代收集算法，
 *     所以堆空间也是基于这一点进行了相应的划分：新生代、老年代。Eden空间、From Survivor空间与To Survivor空间。
 *     方法区（Method Area）：存储元信息、永久代（Permanent Generation），从JDK1.8开始，已经彻底废弃了永久代，使用元空间（meta space）
 *     运行时常量池：方法区的一部分内容。
 *     直接内存：Direct Memory
 *
 *     关于Java对象创建的过程：

     new关键字创建对象的3个步骤：

     1. 在堆内存中创建出对象的实例
     2. 为对象的成员变量赋初值
     3. 将对象的引用返回

     指针碰撞（前提是堆中的空间通过一个指针进行分割，一侧是已经被占用的空间，另一侧是未被占用的空间）
     空闲列表（前提是堆内存空间中已被使用的空间是交织在一起的，这时，虚拟机就需要通过一个列表来记录哪些空间是可以使用的，
     哪些空间是已被使用的，接下来找出可以容纳下新建对象的且未被使用的空间，在此空间存放该对象，同时还要修改列表上的记录）

     > 对象在内存中的布局：

     1. 对象头
     2. 实例数据（即我们在一个类中所声明的各项信息）
     3. 对齐填充（可选）

     > 引用访问对象的方式

     1. 使用句柄的方式
     2. 使用直接指针的方式
 * </p>
 *
 * @author sunxiaodong
 * @date 2020/5/5 5:16 PM
 */
public class Demo1 {

    public static void main(String[] args) {
        List<Demo1> list = new ArrayList();
        for (;;){
            list.add(new Demo1());
            System.gc();
        }
    }

}
