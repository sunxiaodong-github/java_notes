var service = require('../static_codegen/proto/Student_grpc_pb');
var message = require('../static_codegen/proto/Student_pb');

var grpc = require('grpc');

var client = new service.StudentServiceClient("localhost:8888", grpc.credentials.createInsecure());

var request = new message.MyRequest();
request.setUsername("lisi");

client.getRealNameByUsername(request, function(error, respData){
    console.log(respData.getRealname());
});