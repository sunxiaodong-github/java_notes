package com.java.base.learn.designPatterns.prototype;

import java.io.Serializable;

/**
 * <p></p>
 *
 * @author sunxiaodong
 * @date 20-4-26 上午2:36
 **/
public class DeepCloneableTarget implements Serializable, Cloneable {

    private static final long serialVersionUID = 6902977106616773274L;

    private String cloneName;
    private String cloneClass;

    public DeepCloneableTarget(String cloneName, String cloneClass) {
        this.cloneName = cloneName;
        this.cloneClass = cloneClass;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
