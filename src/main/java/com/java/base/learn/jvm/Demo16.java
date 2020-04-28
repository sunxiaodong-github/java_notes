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
        Demo16 loader = new Demo16("loader");
        loader.setPath("/home/sunxiaodong/Desktop/");
        Class<?> clazz = loader.loadClass("com.java.base.learn.jvm.Demo1");
        Object instance = clazz.newInstance();
        System.out.println(instance);
    }

}
