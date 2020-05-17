package com.java.base.learn.designPatterns.iterator;

import java.util.Iterator;
import java.util.List;

/**
 * <p></p>
 *
 * @author sunxiaodong
 * @date 2020/5/17 10:45 PM
 */
public class OutPutImpl {

    List<College> colleges;

    public OutPutImpl(List<College> colleges){
        this.colleges = colleges;
    }

    public void printCollege(){
        Iterator<College> iterator = colleges.iterator();
        while (iterator.hasNext()){
            College college = iterator.next();
            System.out.println("============" + college.getName() + "============");
            printDepartment(college.createIterator());
        }
    }

    public void printDepartment(Iterator iterator){
        while (iterator.hasNext()){
            Department department = (Department) iterator.next();
            System.out.println(department.getName());
        }
    }
}
