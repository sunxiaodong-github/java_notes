package com.java.base.learn.designPatterns.decorator;

/**
 * <p></p>
 *
 * @author sunxiaodong
 * @date 20-5-11 下午4:47
 **/
public class Coffee extends Drink {

    @Override
    protected float cost() {
        return super.getPrice();
    }
}
