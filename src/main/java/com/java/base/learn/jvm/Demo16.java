package com.java.base.learn.jvm;

import java.io.*;

/**
 * <p>
 * 自定义类加载器
 * </p>
 *
 * @author sunxiaodong
 * @date 20-4-28 上午2:51
 **/
public class Demo16 extends ClassLoader {

    private String classLoaderName;
    private String path;
    private final String fileExtension = ".class";

    public Demo16(String classLoaderName) {
        // 将系统类当做该类的类加载器的父加载器
        super();
        this.classLoaderName = classLoaderName;
    }

    public Demo16(ClassLoader parent, String classLoaderName) {
        // 显示指定该类的类加载器的父加载器
        super(parent);
        this.classLoaderName = classLoaderName;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        System.out.println("findClass invoked: " + name);
        System.out.println("class loader name: " + this.classLoaderName);
        byte[] data = this.loadClassData(name);

        return this.defineClass(name, data, 0, data.length);
    }

    private byte[] loadClassData(String className) {
        InputStream inputStream = null;
        byte[] data = null;
        ByteArrayOutputStream baos = null;
        className = className.replace(".", "/");
        try {
            inputStream = new FileInputStream(new File(this.path + className + this.fileExtension));
            baos = new ByteArrayOutputStream();
            int ch;
            while (-1 != (ch = inputStream.read())) {
                baos.write(ch);
            }
            data = baos.toByteArray();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                inputStream.close();
                baos.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        return data;
    }

    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        Demo16 loader1 = new Demo16("loader1");
        loader1.setPath("/Users/sunxiaodong/Desktop/");
        Class<?> clazz1 = loader1.loadClass("com.java.base.learn.jvm.Demo1");
        System.out.println("class1: " + clazz1.hashCode());
        Object instance1 = clazz1.newInstance();
        System.out.println(instance1);

        System.out.println();
        /**
         * 命名空间
         * 每个类加载器都有自己的命名空间，命名空间由该加载器及所有父加载器所加载的类组成
         * 在同一个命名空间中，不会出现类的完整名字（包括类的包名）相同的两个类
         * 在不同的命名空间中，有可能会出现类的完整名字（包括类的包名）相同的两个类
         */
        //Demo16 loader2 = new Demo16("loader2");
        Demo16 loader2 = new Demo16(loader1, "loader2");
        loader2.setPath("/Users/sunxiaodong/Desktop/");
        Class<?> clazz2 = loader2.loadClass("com.java.base.learn.jvm.Demo1");
        System.out.println("class2: " + clazz2.hashCode());
        Object instance2 = clazz2.newInstance();
        System.out.println(instance2);
    }

}
