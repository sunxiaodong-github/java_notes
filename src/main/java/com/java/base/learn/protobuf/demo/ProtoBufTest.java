package com.java.base.learn.protobuf.demo;

import com.google.protobuf.InvalidProtocolBufferException;

/**
 * <p></p>
 *
 * @author sunxiaodong
 * @date 2020/4/5 1:09 AM
 */
public class ProtoBufTest {

    public static void main(String[] args) throws InvalidProtocolBufferException {
        // 1. A服务创建的对象
        DataInfo.Student student = DataInfo.Student.newBuilder()
                .setName("zhangsan").setAge(21).setAddress("shanghai").build();

        // 2. 由网络传输转换的字节数组
        byte[] student2ByteArray = student.toByteArray();

        // 3. B服务接收字节数组，转换成对象，一一获取字段。【不一定就是java客户端语言编写的】
        DataInfo.Student student2 = DataInfo.Student.parseFrom(student2ByteArray);
        System.out.println(student2.getName() + " " + student2.getAge() + " " + student2.getAddress());
    }
}
