package com.java.base.learn.designPatterns.iterator;

import java.util.Iterator;

/**
 * <p></p>
 *
 * @author sunxiaodong
 * @date 2020/5/17 10:30 PM
 */
public interface College {

    String getName();

    void addDepartment(String name, String desc);

    Iterator createIterator();

}
