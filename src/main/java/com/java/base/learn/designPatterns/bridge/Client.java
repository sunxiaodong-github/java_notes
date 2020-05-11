package com.java.base.learn.designPatterns.bridge;

/**
 * <p></p>
 *
 * @author sunxiaodong
 * @date 20-5-11 下午3:34
 **/
public class Client {

    public static void main(String[] args) {
        // 获取折叠式手机+品牌
        Phone phone1 = new FoldedPhone(new XiaoMi());
        phone1.open();
        phone1.call();
        phone1.close();

        System.out.println("===========================>");

        Phone phone2 = new UpRightPhone(new Vivo());
        phone2.open();
        phone2.call();
        phone2.close();
    }
}
