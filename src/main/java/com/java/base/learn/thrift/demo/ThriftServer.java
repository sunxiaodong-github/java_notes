package com.java.base.learn.thrift.demo;

import org.apache.thrift.TProcessorFactory;
import org.apache.thrift.protocol.TCompactProtocol;
import org.apache.thrift.server.THsHaServer;
import org.apache.thrift.transport.TFramedTransport;
import org.apache.thrift.transport.TNonblockingServerSocket;
import org.apache.thrift.transport.TTransportException;

/**
 * <p></p>
 *
 * @author sunxiaodong
 * @date 2020/4/6 6:35 PM
 */
public class ThriftServer {

    public static void main(String[] args) throws TTransportException {
        TNonblockingServerSocket serverSocket = new TNonblockingServerSocket(8888);
        THsHaServer.Args arg = new THsHaServer.Args(serverSocket).maxWorkerThreads(4).minWorkerThreads(2);
        PersonService.Processor<PersonServiceImpl> processor = new PersonService.Processor<>(new PersonServiceImpl());
        // 数据传输协议
        arg.protocolFactory(new TCompactProtocol.Factory());
        arg.transportFactory(new TFramedTransport.Factory());
        arg.processorFactory(new TProcessorFactory(processor));

        THsHaServer server = new THsHaServer(arg);
        System.out.println("Thrift server started");
        server.serve();
    }
}
