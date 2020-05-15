package com.java.base.learn.designPatterns.template;

/**
 * <p></p>
 *
 * @author sunxiaodong
 * @date 20-5-15 上午11:50
 **/
public class RedBeanSoyaMilk extends SoyaMilk {

    @Override
    protected void addCondiments() {
        System.out.println("加入红豆..");
    }
}
