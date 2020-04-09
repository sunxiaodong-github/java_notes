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

**Node示例的静态代码生成**

参考： https://github.com/grpc/grpc/tree/master/examples/node/static_codegen

使用protoc和Node gRPC protoc插件预先生成的，并且可以在各种* _pb.js文件中找到生成的代码。生成这些文件的命令行顺序如下（假定存在protoc和grpc_node_plugin）
```
npm install -g grpc-tools
grpc_tools_node_protoc --js_out=import_style=commonjs,binary:static_codegen/ --grpc_out=static_codegen/ --plugin=/opt/node-v12.16.1-linux-x64/bin/grpc_tools_node_protoc_plugin proto/Student.proto
```

装饰模式：

* 用来扩展特定对象的功能

* 不需要子类

* 动态

* 运行时分配职责

* 防止由于子类而导致的复杂和混乱

* 更多的灵活性

* 对于一个给定的对象，同时可能有不同的装饰对象，客户端可以通过它的需要选择合适的装饰对象发送消息。
