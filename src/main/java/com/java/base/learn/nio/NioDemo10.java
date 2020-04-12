package com.java.base.learn.nio;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

/**
 * <p>
 *     FileLock
 * </p>
 *
 * @author sunxiaodong
 * @date 2020/4/12 10:57 AM
 */
public class NioDemo10 {

    public static void main(String[] args) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile("NioDemo10.txt", "rw");
        FileChannel fileChannel = randomAccessFile.getChannel();
        FileLock fileLock = fileChannel.lock(2, 3, true);
        System.out.println("valid: " + fileLock.isValid());
        System.out.println("lock type: " + fileLock.isShared());
        fileLock.release();
        randomAccessFile.close();
    }
}
