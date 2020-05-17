package com.java.base.learn.designPatterns.visitor;

/**
 * <p></p>
 *
 * @author sunxiaodong
 * @date 2020/5/17 12:45 PM
 */
public abstract class Action {

    protected abstract void getManResult(Man man);

    protected abstract void getWomanResult(WoMan man);
}
