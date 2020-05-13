package com.java.base.learn.designPatterns.composite;

/**
 * <p>组合模式</p>
 *
 * @author sunxiaodong
 * @date 2020/5/13 10:02 PM
 */
public abstract class OrganizationComponent {
    private String name;
    private String description;

    protected void add(OrganizationComponent organizationComponent){
        throw new UnsupportedOperationException();
    }

    protected void remove(OrganizationComponent organizationComponent){
        throw new UnsupportedOperationException();
    }

    public OrganizationComponent(String name, String description) {
        super();
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    protected abstract void print();
}
