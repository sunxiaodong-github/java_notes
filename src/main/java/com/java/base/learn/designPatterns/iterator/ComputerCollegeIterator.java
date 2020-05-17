package com.java.base.learn.designPatterns.iterator;

import java.util.Iterator;

/**
 * <p></p>
 *
 * @author sunxiaodong
 * @date 2020/5/17 10:12 PM
 */
public class ComputerCollegeIterator implements Iterator {

    Department[] departments;
    int position = 0;

    public ComputerCollegeIterator(Department[] departments) {
        this.departments = departments;
    }

    @Override
    public boolean hasNext() {
        if (position >= departments.length || departments[position] == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object next() {
        Department department = departments[position];
        position += 1;
        return department;
    }

    @Override
    public void remove() {

    }
}
