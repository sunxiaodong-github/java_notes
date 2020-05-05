package com.java.base.learn.jvm.bytecode;

import java.util.Date;

/**
 * <p>
 *     针对方法调用动态分派的过程，虚拟机会在方法区建立一个虚方法表的数据结构（virtual method table、vtable），
 *     针对于invokeinteface指令来说，虚拟机会建立一个叫做接口方法表的数据结构（interface method table、itable）
 *
 * </p>
 *
 * @author sunxiaodong
 * @date 2020/5/5 12:05 PM
 */
public class Demo7 {

    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal dog = new Dog();

        animal.test("hello");
        dog.test(new Date());
    }
}

class Animal {

    public void test(String str) {
        System.out.println("Animal str");
    }

    public void test(Date date) {
        System.out.println("Animal date");
    }
}

class Dog extends Animal {

    @Override
    public void test(String str) {
        System.out.println("Dog str");
    }

    @Override
    public void test(Date date) {
        System.out.println("Dog date");
    }
}