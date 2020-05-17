package com.java.base.learn.designPatterns.iterator;

import java.util.Iterator;
import java.util.List;

/**
 * <p></p>
 *
 * @author sunxiaodong
 * @date 2020/5/17 10:22 PM
 */
public class InfoCollegeIterator implements Iterator {

    List<Department> departments;
    int index = -1;

    public InfoCollegeIterator(List<Department> departments) {
        this.departments = departments;
    }

    @Override
    public boolean hasNext() {
        if (index >= departments.size() - 1) {
            return false;
        } else {
            index += 1;
            return true;
        }
    }

    @Override
    public Object next() {
        return departments.get(index);
    }

    @Override
    public void remove() {

    }
}
