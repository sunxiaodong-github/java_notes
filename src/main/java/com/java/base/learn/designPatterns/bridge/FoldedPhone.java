package com.java.base.learn.designPatterns.bridge;

/**
 * <p>折叠式手机类，继承抽象类Phone</p>
 *
 * @author sunxiaodong
 * @date 20-5-11 下午3:28
 **/
public class FoldedPhone extends Phone {

    public FoldedPhone(Brand brand){
        super(brand);
    }

    public void open(){
        super.open();
        System.out.println("折叠样式手机");
    }

    public void close(){
        super.close();
        System.out.println("折叠样式手机");
    }

    public void call(){
        super.call();
        System.out.println("折叠样式手机");
    }
}
