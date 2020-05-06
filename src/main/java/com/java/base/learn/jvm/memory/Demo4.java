package com.java.base.learn.jvm.memory;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;

/**
 * <p>方法栈产生内存溢出错误</p>
 *
 * @author sunxiaodong
 * @date 20-5-6 上午10:54
 **/
public class Demo4 {

    public static void main(String[] args) {
        //  -XX:MaxMetaspaceSize=10m -XX:+TraceClassLoading
        for(;;){
            Enhancer enhancer = new Enhancer();
            enhancer.setSuperclass(Demo4.class);
            enhancer.setUseCache(false);
            enhancer.setCallback((MethodInterceptor)(Obj, method, args1, proxy) ->
                    proxy.invokeSuper(Obj, args1));
            System.out.println("hello world");
            enhancer.create();
        }
    }
}
