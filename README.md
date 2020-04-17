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

> 装饰模式：

* 用来扩展特定对象的功能；
* 不需要子类；
* 动态；
* 运行时分配职责；
* 防止由于子类而导致的复杂和混乱；
* 更多的灵活性；
* 对于一个给定的对象，同时可能有不同的装饰对象，客户端可以通过它的需要选择合适的装饰对象发送消息。

> Reactor 模式的角色组成（Reactor模式一般由5种角色构成）

![Reactor.png](Reactor.png)

* Handle（具柄或是描述符）：本质上表示一种资源，是由操作系统提供的，该资源用于表示一个个的事件，
比如说文件描述符，或者针对网络编程中的Socket描述符。事件既可以来自于外部，也可以来自于内部；
外部事件比如说客户端的连接请求，客户端发送过来的数据等；内部事件比如说操作系统产生的定时器事件等。
它本质就是一个文件描述符，Handle是事件产生的发源地。
* Synchronous Event Demultiplexer（同步事件分离器）：它本身是一个系统调用，用于等待事件的发生（事件可能是一个事件，也可能是多个）；
调用方在调用它的时候会被阻塞，一直阻塞到同步事件分离器上有事件产生为止，
对于Linux来说，同步事件分离器指的就是常用的I/O多路复用的机制，比如说select、poll、epoll等；
在Java NIO领域中，同步事件分离器对应的组件就是Selector；对应的阻塞方法就是select方法。
* Event Handler（事件处理器）：本身由多个回调方法构成，这些回调方法构成了与应用相关的对于某个事件的反馈机制；
Netty相比Java NIO来说，在事件处理器这个角色上进行一个升级，它为我们开发者提供了大量的回调方法，供我们在特定事件产生时实现相应的回调方法进行业务逻辑的处理。
* Concrete Event Handler（具体事件处理器）：它是事件处理器的实现，它本身实现了事件处理器所提供的各个回调方法，从而实现特定业务的逻辑；
它本质上就是我们编写的一个个处理器的实现。
* Initiation Dispatcher（初始分发器）：它实际上就是Reactor角色。它本身定义了一些规范，这些规范用于控制事件的调度方式，
同时又提供了应用进行事件处理器的注册、删除等设施。它本身是整个事件的核心所在，Initiation Dispatcher会通过同步事件分离器来等待事件的发生。
一旦事件发生，Initiation Dispatcher首先会分离出每一个事件，然后调用事件处理器，最后调用相关的回调方法来处理这些事件。
