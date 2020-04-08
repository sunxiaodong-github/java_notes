var PORT_FILE_PATH = '/home/sunxiaodong/vsCodeProjects/grpc_demo/proto/Student.proto';
var grpc = require('grpc');
var grpcService = grpc.load(PORT_FILE_PATH).com.java.base.learn.grpc.demo;

var server = new grpc.Server();

server.addService(grpcService.StudentService.service, {
    getRealNameByUsername: getRealNameByUsername,
    getStudentsByAge: getStudentsByAge,
    getStudentsWrapperByAges: getStudentsWrapperByAges,
    biTalk: biTalk
});

server.bind('localhost:8888', grpc.ServerCredentials.createInsecure());
server.start();

function getRealNameByUsername(call, callback) {
    console.log(call.request.username);
    callback(null, { realname: 'admin' })
}

function getStudentsByAge() { }

function getStudentsWrapperByAges() { }

function biTalk() { }