package com.java.base.learn.jvm.classloader;

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

    public Demo16(ClassLoader parent){
        super(parent);
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

    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException, InterruptedException {
        Demo16 loader1 = new Demo16("loader1");
        loader1.setPath("/home/sunxiaodong/Desktop/");
        Class<?> clazz1 = loader1.loadClass("com.java.base.learn.jvm.classloader.Demo1");
        System.out.println("class1: " + clazz1.hashCode());
        Object instance1 = clazz1.newInstance();
        System.out.println(instance1);

        System.out.println();

        // -XX:+TraceClassUnloading
        loader1 = null;
        clazz1 = null;
        instance1 = null;
        System.gc();

        Thread.sleep(20000);

        loader1 = new Demo16("loader1");
        loader1.setPath("/home/sunxiaodong/Desktop/");
        clazz1 = loader1.loadClass("com.java.base.learn.jvm.classloader.Demo1");
        System.out.println("class1: " + clazz1.hashCode());
        instance1 = clazz1.newInstance();
        System.out.println(instance1);
        /**
         * 1. 子加载器所加载的类能够访问到父加载器所加载的类
         * 2. 父加载器所加载的类无法访问到子加载器所加载的类
         */
        System.out.println();
        //Demo16 loader2 = new Demo16("loader2");
        Demo16 loader2 = new Demo16(loader1, "loader2");
        loader2.setPath("/home/sunxiaodong/Desktop/");
        Class<?> clazz2 = loader2.loadClass("com.java.base.learn.jvm.classloader.Demo1");
        System.out.println("class2: " + clazz2.hashCode());
        Object instance2 = clazz2.newInstance();
        System.out.println(instance2);

        System.out.println();
        Demo16 loader3 = new Demo16(loader2,"loader3");
        loader3.setPath("/home/sunxiaodong/Desktop/");
        Class<?> clazz3 = loader3.loadClass("com.java.base.learn.jvm.classloader.Demo1");
        System.out.println("class2: " + clazz3.hashCode());
        Object instance3 = clazz3.newInstance();
        System.out.println(instance3);

    }

}
