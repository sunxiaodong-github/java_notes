package com.java.base.learn.designPatterns.decorator;

/**
 * <p></p>
 *
 * @author sunxiaodong
 * @date 20-5-11 下午4:51
 **/
public class Decorator extends Drink {

    private Drink drink;

    public Decorator(Drink drink) {
        this.drink = drink;
    }

    @Override
    protected float cost() {
        return super.getPrice() + drink.cost();
    }

    @Override
    public String getDes() {
        return super.des + " " + super.getPrice() + "&&" + drink.getDes();
    }
}
