# Netty

### WebSocket实现与原理分析

### WebSocket连接建立方式与声明周期分解

### WebSocket服务端与客户端开发

### RPC框架分析

RPC：Remote Procedure Call，远程过程调用，很多RPC框架是跨语言的。

* 定义一个接口说明文件：描述了对象（结构体）、对象成员、接口方法等一系列信息；
* 通过RPC框架所提供的编译器，将接口说明文件编译成具体语言文件；
* 在客户端和与服务器端分别引入RPC编译器所生成的文件，即可像调用本地方法一样调用远程方法。

> Google Protocol Buffers 使用方式分析

```
protoc --java_out=src/main/java src/protobuf/Person.proto
```

> Apache Thrift 使用方式分析

```
thrift --gen java src/thrift/data.thrift
```

> gRPC 使用方式分析

基于 Protocol Buffers。