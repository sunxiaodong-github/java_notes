package com.java.base.learn.designPatterns.visitor;

/**
 * <p></p>
 *
 * @author sunxiaodong
 * @date 2020/5/17 1:10 PM
 */
public class Man extends Person {

    @Override
    protected void accept(Action action) {
        action.getManResult(this);
    }
}
