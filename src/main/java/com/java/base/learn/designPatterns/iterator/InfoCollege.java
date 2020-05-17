package com.java.base.learn.designPatterns.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * <p></p>
 *
 * @author sunxiaodong
 * @date 2020/5/17 10:40 PM
 */
public class InfoCollege implements College {

    List<Department> departments;

    public InfoCollege(){
        departments = new ArrayList<>();
        addDepartment("信息安全专业", "信息安全专业");
        addDepartment("网络安全专业", "网络安全专业");
        addDepartment("服务器安全专业", "服务器安全专业");
    }

    @Override
    public String getName() {
        return "信息工程学院";
    }

    @Override
    public void addDepartment(String name, String desc) {
        Department department = new Department(name, desc);
        departments.add(department);
    }

    @Override
    public Iterator createIterator() {
        return new InfoCollegeIterator(departments);
    }
}
