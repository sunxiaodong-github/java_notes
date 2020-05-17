package com.java.base.learn.designPatterns.iterator;

/**
 * <p></p>
 *
 * @author sunxiaodong
 * @date 2020/5/17 10:10 PM
 */
public class Department {

    private String name;
    private String desc;

    public Department(String name, String desc) {
        super();
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
