package com.java.base.learn.designPatterns.bridge;

/**
 * <p></p>
 *
 * @author sunxiaodong
 * @date 20-5-11 下午3:26
 **/
public abstract class Phone {

    private Brand brand;

    public Phone(Brand brand) {
        super();
        this.brand = brand;
    }

    protected void open(){
        this.brand.open();
    }

    protected void close(){
        this.brand.close();
    }

    protected void call(){
        this.brand.call();
    }
}
