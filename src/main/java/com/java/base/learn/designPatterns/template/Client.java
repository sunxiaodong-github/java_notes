package com.java.base.learn.designPatterns.template;

import com.java.base.learn.designPatterns.template.improve.PureSoyaMilk;

/**
 * <p></p>
 *
 * @author sunxiaodong
 * @date 20-5-15 上午11:52
 **/
public class Client {

    public static void main(String[] args) {
        System.out.println("---------------------制作红豆豆浆------------------");
        SoyaMilk redBeanSoyaMilk = new RedBeanSoyaMilk();
        redBeanSoyaMilk.make();

        System.out.println("---------------------制作花生豆浆------------------");
        SoyaMilk peanutSoyaMilk = new PeanutSoyaMilk();
        peanutSoyaMilk.make();

        System.out.println("---------------------制作纯豆浆------------------");
        com.java.base.learn.designPatterns.template.improve.SoyaMilk pureSoyaMilk = new PureSoyaMilk();
        pureSoyaMilk.make();
    }
}
