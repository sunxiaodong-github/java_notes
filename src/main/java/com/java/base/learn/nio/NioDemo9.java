package com.java.base.learn.nio;

import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

/**
 * <p></p>
 *
 * @author sunxiaodong
 * @date 2020/4/12 10:51 AM
 */
public class NioDemo9 {

    public static void main(String[] args) throws Exception {
        RandomAccessFile randomAccessFile = new RandomAccessFile("NioTest9.txt", "rw");
        FileChannel fileChannel = randomAccessFile.getChannel();
        MappedByteBuffer mappedByteBuffer = fileChannel.map(FileChannel.MapMode.READ_WRITE, 0, 5);
        mappedByteBuffer.put(0, (byte)'a');
        mappedByteBuffer.put(2, (byte)'b');
        randomAccessFile.close();
    }
}
