package com.java.base.learn.designPatterns.composite;

/**
 * <p></p>
 *
 * @author sunxiaodong
 * @date 2020/5/13 11:01 PM
 */
public class Client {

    public static void main(String[] args) {
        University university = new University("清华大学", "中国顶级大学");
        College college1 = new College("计算机学院", "计算机学院");
        College college2 = new College("信息科学学院", "信息科学学院");

        college1.add(new Department("软件工程", "软件工程好"));
        college1.add(new Department("网络工程", "网络工程好"));
        college1.add(new Department("计算机科学与技术", "计算机科学与技术好"));

        college2.add(new Department("通信工程", "通信工程难"));
        college2.add(new Department("土木工程", "土木工程难"));
        college2.add(new Department("信息工程", "信息工程2222"));

        university.add(college1);
        university.add(college2);

        //university.print();

        college1.print();
    }
}
