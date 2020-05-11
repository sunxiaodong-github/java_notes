package com.java.base.learn.designPatterns.bridge;

/**
 * <p></p>
 *
 * @author sunxiaodong
 * @date 20-5-11 下午3:38
 **/
public class UpRightPhone extends Phone {

    public UpRightPhone(Brand brand) {
        super(brand);
    }

    public void open(){
        super.open();
        System.out.println("直立式手机");
    }

    public void close(){
        super.close();
        System.out.println("直立式手机");
    }

    public void call(){
        super.call();
        System.out.println("直立式手机");
    }

}
