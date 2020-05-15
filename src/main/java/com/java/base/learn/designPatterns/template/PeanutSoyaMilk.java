package com.java.base.learn.designPatterns.template;

/**
 * <p></p>
 *
 * @author sunxiaodong
 * @date 20-5-15 上午11:51
 **/
public class PeanutSoyaMilk extends SoyaMilk {

    @Override
    protected void addCondiments() {
        System.out.println("加入花生..");
    }
}
