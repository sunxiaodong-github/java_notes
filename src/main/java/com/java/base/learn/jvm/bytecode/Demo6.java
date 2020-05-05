package com.java.base.learn.jvm.bytecode;

/**
 * <p>
 *     方法的动态分派
 *     方法的动态分派涉及到一个重要概念：方法接收者
 *     invokevirtual字节码指令的多态查找流程
 *
 *     比较方法重载（overload）与方法重写（override）
 *     方法重载是静态的，是编译器行为；方法重写是动态的，是运行期行为。
 * </p>
 *
 * @author sunxiaodong
 * @date 2020/5/5 12:47 AM
 */
public class Demo6 {

    public static void main(String[] args) {
        Fruit apple = new Apple();
        Fruit orange = new Orange();

        apple.test();
        orange.test();

        apple = new Orange();
        apple.test();
    }
}

class Fruit {

    public void test() {
        System.out.println("Fruit");
    }
}

class Apple extends Fruit {
    @Override
    public void test() {
        System.out.println("Apple");
    }
}

class Orange extends Fruit {
    @Override
    public void test() {
        System.out.println("Orange");
    }
}