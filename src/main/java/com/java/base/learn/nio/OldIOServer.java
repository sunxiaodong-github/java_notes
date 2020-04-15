package com.java.base.learn.nio;

import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * <p></p>
 *
 * @author sunxiaodong
 * @date 20-4-14 上午5:55
 **/
public class OldIOServer {

    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(8888);

        while (true){
            Socket socket = serverSocket.accept();
            DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());

            try {
                byte[] bytes = new byte[4096];
                while (true){
                    int count = dataInputStream.read(bytes, 0, bytes.length);
                    if (-1 == count){
                        break;
                    }
                }
            }catch (Exception ex){
                ex.printStackTrace();
            }
        }
    }
}
