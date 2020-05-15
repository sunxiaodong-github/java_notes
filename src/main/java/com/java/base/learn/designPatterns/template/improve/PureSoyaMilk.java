package com.java.base.learn.designPatterns.template.improve;

/**
 * <p></p>
 *
 * @author sunxiaodong
 * @date 20-5-15 下午1:08
 **/
public class PureSoyaMilk extends SoyaMilk {

    @Override
    protected void addCondiments() {
    }

    @Override
    protected boolean customerWantCondiments() {
        return false;
    }
}
