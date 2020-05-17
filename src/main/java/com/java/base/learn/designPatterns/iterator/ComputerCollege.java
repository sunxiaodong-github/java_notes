package com.java.base.learn.designPatterns.iterator;

import java.util.Iterator;

/**
 * <p></p>
 *
 * @author sunxiaodong
 * @date 2020/5/17 10:32 PM
 */
public class ComputerCollege implements College{
    Department[] departments;
    int numOfDepartment = 0;

    public ComputerCollege(){
        departments = new Department[5];
        addDepartment("java", "java");
        addDepartment("C++", "C");
        addDepartment("Python", "py");
    }

    @Override
    public String getName() {
        return "计算机学院";
    }

    @Override
    public void addDepartment(String name, String desc) {
        Department department = new Department(name, desc);
        departments[numOfDepartment] = department;
        numOfDepartment += 1;

    }

    @Override
    public Iterator createIterator() {
        return new ComputerCollegeIterator(departments);
    }
}
