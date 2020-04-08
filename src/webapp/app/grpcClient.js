var PROTO_FILE_PATH = '/home/sunxiaodong/vsCodeProjects/grpc_demo/proto/Student.proto';
var grpc = require('grpc');
var grpcService = grpc.load(PROTO_FILE_PATH).com.java.base.learn.grpc.demo;

var client = new grpcService.StudentService('localhost:8888', grpc.credentials.createInsecure());

client.getRealNameByUsername({ username: "张三" }, function (error, respData) {
    console.log(respData);
});