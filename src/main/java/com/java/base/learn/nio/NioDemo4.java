package com.java.base.learn.nio;

import java.time.LocalDateTime;

/**
 * <p>
 *     关于Nio Buffer中的3个重要状态属性的含义：position、limit与capacity
 * </p>
 *
 * @author sunxiaodong
 * @date 20-4-9 下午11:37
 **/
public class NioDemo4 {

    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now.toString());
    }
}
