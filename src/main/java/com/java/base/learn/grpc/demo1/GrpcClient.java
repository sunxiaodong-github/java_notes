package com.java.base.learn.grpc.demo1;

import com.java.base.learn.grpc.MyRequest;
import com.java.base.learn.grpc.MyResponse;
import com.java.base.learn.grpc.StudentServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

/**
 * <p></P>
 *
 * @author sunxiaodong
 * @date 20-4-7 上午4:50
 **/
public class GrpcClient {

    public static void main(String[] args) {
        ManagedChannel managedChannel = ManagedChannelBuilder.forAddress("localhost", 8888).usePlaintext().build();
        StudentServiceGrpc.StudentServiceBlockingStub blockingStub = StudentServiceGrpc.newBlockingStub(managedChannel);
        MyResponse myResponse = blockingStub.getRealNameByUsername(MyRequest.newBuilder().setUsername("偏执狂").build());
        System.out.println(myResponse.getRealname());
    }
}
