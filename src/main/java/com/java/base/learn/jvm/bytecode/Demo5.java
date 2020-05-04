package com.java.base.learn.jvm.bytecode;

/**
 * <p>
 *     方法的静态分派
 *     Grandpa father = new Father();
 *     以上代码，father的静态类型是Grandpa，而father的实际类型是（真正指向的类型）是Father。
 *     我们得出这样一个结论：变量的静态类型是不会发生变化的，而变量的实际类型则是可以发生变化的（多态的一种体现），实际类型是在运行期间可确定。
 * </p>
 *
 * @author sunxiaodong
 * @date 2020/5/4 11:42 PM
 */
public class Demo5 {

    // 方法的重载，是一种静态的行为
    public void test(Grandpa grandpa){
        System.out.println("grandpa");
    }

    public void test(Father father){
        System.out.println("father");
    }

    public void test(Son son){
        System.out.println("son");
    }

    public static void main(String[] args) {
        Grandpa father = new Father();
        Grandpa son = new Son();

        Demo5 demo5 = new Demo5();
        demo5.test(father);
        demo5.test(son);
    }
}

class Grandpa {

}

class Father extends Grandpa {

}

class Son extends Father {

}
