package com.java.base.learn.designPatterns.adapter.interfaceadapter;

/**
 * <p>
 *     接口适配器模式
 * </p>
 *
 * @author sunxiaodong
 * @date 20-4-27 上午3:04
 **/
public class Client {

    public static void main(String[] args) {
        new AbsAdapter(){
            @Override
            public void m1() {
                System.out.println("使用m1方法");
            }
        };
    }
}
