package com.java.base.learn.designPatterns.decorator;

/**
 * <p></p>
 *
 * @author sunxiaodong
 * @date 20-5-11 下午5:00
 **/
public class CoffeeBar {

    public static void main(String[] args) {
        Drink order = new LongBlack();
        System.out.println("费用：" + order.cost());
        // 加牛奶
        order = new Milk(order);
        System.out.println("加入牛奶后费用：" + order.cost());

        order = new Chocolate(order);
        System.out.println("加入牛奶、巧克力后费用：" + order.cost());
        System.out.println(order.getDes());

        order = new Chocolate(order);
        System.out.println("加入牛奶、2份巧克力后费用：" + order.cost());
        System.out.println(order.getDes());
    }
}
