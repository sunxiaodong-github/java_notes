package com.java.base.learn.designPatterns.proxy.cglib;

/**
 * <p></p>
 *
 * @author sunxiaodong
 * @date 20-5-15 上午9:51
 **/
public class Client {

    public static void main(String[] args) {
        TeacherDao target = new TeacherDao();

        TeacherDao teacherDao = (TeacherDao) new ProxyFactory(target).getProxyInstance();
        teacherDao.teach();
    }
}
