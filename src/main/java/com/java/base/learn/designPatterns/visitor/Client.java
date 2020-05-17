package com.java.base.learn.designPatterns.visitor;

/**
 * <p></p>
 *
 * @author sunxiaodong
 * @date 2020/5/17 2:32 PM
 */
public class Client {

    public static void main(String[] args) {
        ObjectStructure objectStructure = new ObjectStructure();

        objectStructure.attach(new Man());
        objectStructure.attach(new WoMan());

        Success success = new Success();
        objectStructure.display(success);

        System.out.println("===============");
        Fail fail = new Fail();
        objectStructure.display(fail);

        System.out.println("===============");
        Wait wait = new Wait();
        objectStructure.display(wait);
    }
}
