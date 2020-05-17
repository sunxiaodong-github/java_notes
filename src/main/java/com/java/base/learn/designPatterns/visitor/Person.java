package com.java.base.learn.designPatterns.visitor;

/**
 * <p></p>
 *
 * @author sunxiaodong
 * @date 2020/5/17 1:35 PM
 */
public abstract class Person {

    protected abstract void accept(Action action);
}
