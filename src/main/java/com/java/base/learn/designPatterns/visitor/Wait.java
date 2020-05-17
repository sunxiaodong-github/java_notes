package com.java.base.learn.designPatterns.visitor;

/**
 * <p></p>
 *
 * @author sunxiaodong
 * @date 2020/5/17 2:19 PM
 */
public class Wait extends Action {

    @Override
    protected void getManResult(Man man) {
        System.out.println("男评委给该歌手等待");
    }

    @Override
    protected void getWomanResult(WoMan man) {
        System.out.println("女评委给该歌手等待");
    }
}
