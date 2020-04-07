package com.java.base.learn.grpc.demo;

import com.java.base.learn.grpc.*;
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

    @Override
    public void getStudentsByAge(StudentRequest request, StreamObserver<StudentResponse> responseObserver) {
        System.out.println("接收到客户端信息：" + request.getAge());

        responseObserver.onNext(StudentResponse.newBuilder().setName("张三").setAge(21).setCity("shanghai").build());
        responseObserver.onNext(StudentResponse.newBuilder().setName("李四").setAge(21).setCity("beijing").build());
        responseObserver.onNext(StudentResponse.newBuilder().setName("王五").setAge(21).setCity("chongqing").build());
        responseObserver.onNext(StudentResponse.newBuilder().setName("赵六").setAge(21).setCity("福建").build());

        responseObserver.onCompleted();;
    }

    @Override
    public StreamObserver<StudentRequest> getStudentsWrapperByAges(StreamObserver<StudentResponseList> responseObserver) {
        return new StreamObserver<StudentRequest>(){

            @Override
            public void onNext(StudentRequest value) {
                System.out.println("onNext: " + value.getAge());
            }

            @Override
            public void onError(Throwable t) {
                System.out.println(t.getMessage());
            }

            @Override
            public void onCompleted() {
                StudentResponse studentResponse1 = StudentResponse.newBuilder().setName("张三").setAge(21).setCity("shanghai").build();
                StudentResponse studentResponse2 = StudentResponse.newBuilder().setName("lisi").setAge(21).setCity("beijing").build();
                StudentResponse studentResponse3 = StudentResponse.newBuilder().setName("wangwu").setAge(21).setCity("chongqing").build();
                StudentResponseList list = StudentResponseList.newBuilder().addStudentResponse(studentResponse1).addStudentResponse(studentResponse2).addStudentResponse(studentResponse3).build();
                responseObserver.onNext(list);
                responseObserver.onCompleted();
            }
        };
    }
}
