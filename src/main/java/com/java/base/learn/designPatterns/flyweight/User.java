package com.java.base.learn.designPatterns.flyweight;

/**
 * <p>外部状态</p>
 *
 * @author sunxiaodong
 * @date 20-5-14 下午3:39
 **/
public class User {

    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
