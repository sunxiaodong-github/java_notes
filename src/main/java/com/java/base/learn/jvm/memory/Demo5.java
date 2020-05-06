package com.java.base.learn.jvm.memory;

/**
 * <p></p>
 *
 * @author sunxiaodong
 * @date 20-5-6 下午1:59
 **/
public class Demo5 {

    public static void main(String[] args) {
        // jmap -clstats pid 获取当前运行环境的类加载器
        // jstat -gc pid  MC 当前元空间容量 MU 已占用元空间容量
        // jcmd pid VM.flags 查看jvm的启动参数
        for(;;){
            System.out.println("hello world");
        }
    }
}
