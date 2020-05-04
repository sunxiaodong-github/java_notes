package com.java.base.learn.jvm.bytecode;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;

/**
 * <p>
 *     对于Java类中的每一个实例方法（非static方法），其在编译后生成的字节码当中，方法参数中的数量总是会比源代码中方法
 *     参数的数量多一个（this），它位于方法参数中的第一个参数位置处；这样我们就可以在Java的实例方法中使用this去访问当前
 *     对象的属性以及其他方法。
 *
 *     这个操作是在编译期间完成的，即由javac编译器在编译期间的时候将对this的访问转化为对一个普通实例方法参数的访问；接下来在运行期间，
 *     由jvm在调用实例方法时，自动向该实例方法传入该参数。所以，在实例方法的局部变量表中，至少会有一个指向当前对象的局部变量。
 *
 *     Java字节码对于异常的处理方式：
 *     1. 统一采用异常表的方式来对异常进行处理
 *     2. 在JDK1.4.2之前的版本中，并不是使用异常表的方式对异常进行处理的，而是采用特定的指令的方式。
 *     3. 当异常处理存在finally语句块时，现在化的JVM采取的处理方式是将finally语句块的字节码拼接到每一个catch块后面，
 *     换句话说，程序中存在多少个catch块，就会在每一个catch块后面重复多少个finally语句块的字节码。
 * </p>
 *
 * @author sunxiaodong
 * @date 2020/5/4 2:41 PM
 */
public class Demo3 {

    public void test() throws FileNotFoundException, IOException, NullPointerException{
        try {
            InputStream inputStream = new FileInputStream("test.txt");
            ServerSocket serverSocket = new ServerSocket(9999);
            serverSocket.accept();
        } catch (FileNotFoundException e) {

        } catch (IOException e) {

        } catch (Exception ex){

        } finally {
            System.out.println("finally");
        }
    }
}
