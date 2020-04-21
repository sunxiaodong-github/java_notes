package com.java.base.learn.jvm;

/**
 * <p>
 *     对于数组实例来说，其类型是由JVM在运行期间动态生成的，表示为[Lcom.java.base.learn.jvm.Parent4;
 *     这种形式，动态生成的类型，其父类型就是Object。
 *
 *     对于数组来说，JavaDoc经常将构成数组的元素为Component，实际上就是将数组降低一个维度的类型。
 * </p>
 *
 * @author sunxiaodong
 * @date 20-4-21 上午4:32
 **/
public class Demo4 {

    public static void main(String[] args) {
       // Parent4 parent4 = new Parent4();
        Parent4[] parents = new Parent4[1];
        System.out.println(parents.getClass());

        Parent4[][] parent4s = new Parent4[1][1];
        System.out.println(parent4s.getClass());

        int[] ints = new int[1];
        System.out.println(ints.getClass());
        System.out.println(ints.getClass().getSuperclass());

        char[] chars = new char[1];
        System.out.println(chars.getClass());

        boolean[] booleans = new boolean[1];
        System.out.println(booleans.getClass());
    }
}
class Parent4{
    static {
        System.out.println("Parent4 static block");
    }
}
