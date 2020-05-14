package com.java.base.learn.designPatterns.proxy.staticproxy;

/**
 * <p>静态代理</p>
 *
 * @author sunxiaodong
 * @date 20-5-14 下午5:05
 **/
public class TeacherDaoProxy implements ITeacherDao {

    private ITeacherDao target;

    public TeacherDaoProxy(ITeacherDao target) {
        super();
        this.target = target;
    }

    @Override
    public void teach() {
        System.out.println("代理开始...完成某些操作");
        target.teach();
        System.out.println("提交...");
    }
}
