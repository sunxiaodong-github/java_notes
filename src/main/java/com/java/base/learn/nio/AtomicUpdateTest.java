package com.java.base.learn.nio;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/**
 * <p></p>
 *
 * @author sunxiaodong
 * @date 20-4-23 上午2:49
 **/
public class AtomicUpdateTest {

    public static void main(String[] args) {
        /*Person person = new Person();
        for (int i = 0; i < 10; ++i) {
            Thread thread = new Thread(() -> {
                try {
                    Thread.sleep(80);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(person.age++);
            });
            thread.start();
        }*/
        AtomicIntegerFieldUpdater<Person> atomicIntegerFieldUpdater = AtomicIntegerFieldUpdater.newUpdater(Person.class, "age");
        Person person = new Person();
        for (int i = 0; i < 10; ++i) {
            Thread thread = new Thread(() -> {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(atomicIntegerFieldUpdater.getAndIncrement(person));
            });
            thread.start();
        }
    }
}
class Person {
    volatile int age = 1;
}
