package com.java.base.learn.grpc.demo1;

import com.java.base.learn.grpc.MyRequest;
import com.java.base.learn.grpc.MyResponse;
import com.java.base.learn.grpc.StudentServiceGrpc;
import io.grpc.stub.StreamObserver;

/**
 * <p></P>
 *
 * @author sunxiaodong
 * @date 20-4-7 上午4:50
 **/
public class StudentServiceImpl extends StudentServiceGrpc.StudentServiceImplBase {

    @Override
    public void getRealNameByUsername(MyRequest request, StreamObserver<MyResponse> responseObserver) {
        // 接收数据
        System.out.println("接收到客户端信息：" + request.getUsername());
        // 返回数据
        responseObserver.onNext(MyResponse.newBuilder().setRealname("admin").build());
        // 返回结束标识
        responseObserver.onCompleted();
    }
}
