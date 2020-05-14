package com.java.base.learn.designPatterns.flyweight;

/**
 * <p></p>
 *
 * @author sunxiaodong
 * @date 20-5-14 下午3:34
 **/
public class Client {

    public static void main(String[] args) {
        WebSiteFactory factory = new WebSiteFactory();
        WebSize webSize1 = factory.getWebSiteCategory("新闻");
        webSize1.use(new User("tom"));

        WebSize webSize2 = factory.getWebSiteCategory("博客");
        webSize2.use(new User("admin"));

        WebSize webSize3 = factory.getWebSiteCategory("博客");
        webSize3.use(new User("jim"));

        System.out.println(factory.getWebSiteCount());
    }
}
