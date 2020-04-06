package com.java.base.learn.thrift.demo;

import org.apache.thrift.protocol.TCompactProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TFramedTransport;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;

/**
 * <p></p>
 *
 * @author sunxiaodong
 * @date 2020/4/6 6:51 PM
 */
public class ThriftClient {

    public static void main(String[] args) {
        TTransport transport = new TFramedTransport(new TSocket("localhost", 8888), 600);
        TProtocol protocol = new TCompactProtocol(transport);
        PersonService.Client client = new PersonService.Client(protocol);

        try {
            transport.open();

            Person person = client.getPersonByUsername("admin");
            System.out.println(person);

            Person p = new Person();
            p.setUsername("anonymous");
            p.setAge(32);
            p.setMerried(true);
            client.savePerson(p);
        }catch (Exception ex){
            throw new RuntimeException(ex.getMessage(), ex);
        }finally {
            transport.close();
        }
    }
}
