package com.java.base.learn.designPatterns.proxy.staticproxy;

/**
 * <p></p>
 *
 * @author sunxiaodong
 * @date 20-5-14 下午5:10
 **/
public class Client {

    public static void main(String[] args) {
        // 目标对象
        TeacherDao teacherDao = new TeacherDao();
        // 代理对象
        TeacherDaoProxy proxy = new TeacherDaoProxy(teacherDao);
        // 通过代理对象，调用被代理对象的方法
        proxy.teach();
    }
}
