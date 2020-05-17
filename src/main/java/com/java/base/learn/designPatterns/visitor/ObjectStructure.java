package com.java.base.learn.designPatterns.visitor;

import java.util.LinkedList;
import java.util.List;

/**
 * <p>数据结构</p>
 *
 * @author sunxiaodong
 * @date 2020/5/17 2:28 PM
 */
public class ObjectStructure {

    private List<Person> persons = new LinkedList<>();

    public void attach(Person person){
        persons.add(person);
    }

    public void detach(Person person){
        persons.remove(person);
    }

    public void display(Action action){
        for (Person person : persons) {
            person.accept(action);
        }
    }
}
