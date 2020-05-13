package com.java.base.learn.designPatterns.composite;

/**
 * <p></p>
 *
 * @author sunxiaodong
 * @date 2020/5/13 10:57 PM
 */
public class Department extends OrganizationComponent {

    public Department(String name, String description) {
        super(name, description);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDescription() {
        return super.getDescription();
    }

    @Override
    protected void print() {
        System.out.println(getName());
    }
}
