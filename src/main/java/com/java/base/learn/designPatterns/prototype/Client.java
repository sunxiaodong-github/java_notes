package com.java.base.learn.designPatterns.prototype;

/**
 * <p>
 *     原型模式 例如在Spring源码中getBean使用
 * </p>
 *
 * @author sunxiaodong
 * @date 20-4-26 上午2:02
 **/
public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
//        Sheep tom = new Sheep("tom", 1, "白色");
//        Sheep sheep = (Sheep) tom.clone();
//        System.out.println(sheep);

        DeepProtoType deepProtoType = new DeepProtoType();
        deepProtoType.name = "admin";
        deepProtoType.deepCloneableTarget = new DeepCloneableTarget("anonymous", "anonymous class");
        //方式1. 深拷贝
        //DeepProtoType deepProtoType1 = (DeepProtoType) deepProtoType.clone();

        //方式2. 深拷贝
        DeepProtoType deepProtoType1 = (DeepProtoType) deepProtoType.deepClone();

        System.out.println(deepProtoType.hashCode());
        System.out.println(deepProtoType1.hashCode());
    }
}
