package com.java.base.learn.designPatterns.proxy.dynamic;


/**
 * <p></p>
 *
 * @author sunxiaodong
 * @date 20-5-14 下午5:38
 **/
public class Client {

    public static void main(String[] args) {
        ITeacherDao target = new TeachDao();
        ITeacherDao teacherDao = (ITeacherDao) new ProxyFactory(target).getProxyInstance();
        teacherDao.teach();
    }
}
