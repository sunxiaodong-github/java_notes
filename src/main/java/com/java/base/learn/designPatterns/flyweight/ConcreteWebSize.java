package com.java.base.learn.designPatterns.flyweight;

/**
 * <p></p>
 *
 * @author sunxiaodong
 * @date 20-5-14 下午3:27
 **/
public class ConcreteWebSize extends WebSize {

    // 内部状态
    private String type;

    public ConcreteWebSize(String type){
        this.type = type;
    }

    @Override
    public void use(User user) {
        System.out.println("网站的发布形式： " + type + ", " + user.getName() + "在使用中。。。");
    }
}
