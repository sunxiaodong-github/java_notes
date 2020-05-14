package com.java.base.learn.designPatterns.proxy.staticproxy;

/**
 * <p></p>
 *
 * @author sunxiaodong
 * @date 20-5-14 下午5:04
 **/
public class TeacherDao implements ITeacherDao {

    @Override
    public void teach() {
        System.out.println("授课中...");
    }
}
