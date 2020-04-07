package com.java.base.learn.grpc.demo1;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

/**
 * <p></P>
 *
 * @author sunxiaodong
 * @date 20-4-7 上午4:50
 **/
public class GrpcServer {

    private Server server;

    private void start() throws IOException {
        this.server = ServerBuilder.forPort(8888).addService(new StudentServiceImpl()).build().start();
        System.out.println("server started！");

        // 回调钩子函数
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println("关闭jvm");
            GrpcServer.this.stop();
        }));

        System.out.println("执行到这里");
    }

    private void stop(){
        if (null != this.server){
            this.server.shutdown();
        }
    }

    private void awaitTermination() throws InterruptedException {
        if (null != this.server){
            this.server.awaitTermination();
        }
    }

    public static void main(String[] args) throws Exception {
        GrpcServer server = new GrpcServer();
        server.start();
        server.awaitTermination();
    }
}
