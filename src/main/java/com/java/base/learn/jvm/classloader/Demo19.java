package com.java.base.learn.jvm.classloader;

import com.sun.crypto.provider.AESKeyGenerator;

/**
 * <p>
 *     扩展类加载器测试：java -Djava.ext.dirs=./ com.java.base.learn.jvm.classloader.Demo19
 * </p>
 *
 * @author sunxiaodong
 * @date 2020/4/29 10:29 PM
 */
public class Demo19 {

    public static void main(String[] args) {
        AESKeyGenerator aesKeyGenerator = new AESKeyGenerator();
        System.out.println(aesKeyGenerator.getClass().getClassLoader());
        System.out.println(Demo19.class.getClassLoader());
    }
}
