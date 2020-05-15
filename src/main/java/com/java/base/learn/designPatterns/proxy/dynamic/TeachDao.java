package com.java.base.learn.designPatterns.proxy.dynamic;

/**
 * <p></p>
 *
 * @author sunxiaodong
 * @date 20-5-14 下午5:26
 **/
public class TeachDao implements ITeacherDao {

    @Override
    public void teach() {
        System.out.println("授课中....");
    }

    @Override
    public void sayHello(String name) {
        System.out.println(name + ", say hello");
    }
}
