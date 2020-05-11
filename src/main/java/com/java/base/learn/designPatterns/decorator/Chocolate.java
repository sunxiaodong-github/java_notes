package com.java.base.learn.designPatterns.decorator;

/**
 * <p>
 *     具体的Decorator，这里就是调味品
 * </p>
 *
 * @author sunxiaodong
 * @date 20-5-11 下午4:57
 **/
public class Chocolate extends Decorator {

    public Chocolate(Drink drink) {
        super(drink);
        setDes("巧克力");
        setPrice(3.0f);
    }
}
