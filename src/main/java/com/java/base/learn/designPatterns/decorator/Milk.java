package com.java.base.learn.designPatterns.decorator;

/**
 * <p></p>
 *
 * @author sunxiaodong
 * @date 20-5-11 下午4:58
 **/
public class Milk extends Decorator {

    public Milk(Drink drink) {
        super(drink);
        setDes("牛奶");
        setPrice(2.0f);
    }
}
