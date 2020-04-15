package com.java.base.learn.nio;

import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.net.Socket;

/**
 * <p></p>
 *
 * @author sunxiaodong
 * @date 20-4-14 上午6:02
 **/
public class OldIOClient {

    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("localhost", 8888);
        String fileName = "/home/sunxiaodong/Documents/开发总结/升职加薪课/阶段一/1-20 容器化进阶K8S.rar";
        FileInputStream inputStream = new FileInputStream(fileName);
        DataOutputStream outputStream = new DataOutputStream(socket.getOutputStream());

        byte[] bytes = new byte[4096];
        long count;
        long total = 0;

        long startTime = System.currentTimeMillis();

        while ((count = inputStream.read(bytes)) >= 0){
            total += count;
            outputStream.write(bytes);
        }
        System.out.println("发送总字节数： " + total + "， 耗时： " + (System.currentTimeMillis() - startTime));

        outputStream.close();
        socket.close();
        inputStream.close();
    }
}
