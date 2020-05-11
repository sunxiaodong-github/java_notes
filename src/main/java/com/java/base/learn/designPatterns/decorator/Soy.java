package com.java.base.learn.designPatterns.decorator;

/**
 * <p></p>
 *
 * @author sunxiaodong
 * @date 20-5-11 下午4:59
 **/
public class Soy extends Decorator {

    public Soy(Drink drink) {
        super(drink);
        setDes("豆浆");
        setPrice(1.5f);
    }
}
