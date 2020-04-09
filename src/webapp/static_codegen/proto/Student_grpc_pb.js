// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var proto_Student_pb = require('../proto/Student_pb.js');

function serialize_com_java_base_learn_grpc_demo_MyRequest(arg) {
  if (!(arg instanceof proto_Student_pb.MyRequest)) {
    throw new Error('Expected argument of type com.java.base.learn.grpc.demo.MyRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_com_java_base_learn_grpc_demo_MyRequest(buffer_arg) {
  return proto_Student_pb.MyRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_com_java_base_learn_grpc_demo_MyResponse(arg) {
  if (!(arg instanceof proto_Student_pb.MyResponse)) {
    throw new Error('Expected argument of type com.java.base.learn.grpc.demo.MyResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_com_java_base_learn_grpc_demo_MyResponse(buffer_arg) {
  return proto_Student_pb.MyResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_com_java_base_learn_grpc_demo_StreamRequest(arg) {
  if (!(arg instanceof proto_Student_pb.StreamRequest)) {
    throw new Error('Expected argument of type com.java.base.learn.grpc.demo.StreamRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_com_java_base_learn_grpc_demo_StreamRequest(buffer_arg) {
  return proto_Student_pb.StreamRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_com_java_base_learn_grpc_demo_StreamResponse(arg) {
  if (!(arg instanceof proto_Student_pb.StreamResponse)) {
    throw new Error('Expected argument of type com.java.base.learn.grpc.demo.StreamResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_com_java_base_learn_grpc_demo_StreamResponse(buffer_arg) {
  return proto_Student_pb.StreamResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_com_java_base_learn_grpc_demo_StudentRequest(arg) {
  if (!(arg instanceof proto_Student_pb.StudentRequest)) {
    throw new Error('Expected argument of type com.java.base.learn.grpc.demo.StudentRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_com_java_base_learn_grpc_demo_StudentRequest(buffer_arg) {
  return proto_Student_pb.StudentRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_com_java_base_learn_grpc_demo_StudentResponse(arg) {
  if (!(arg instanceof proto_Student_pb.StudentResponse)) {
    throw new Error('Expected argument of type com.java.base.learn.grpc.demo.StudentResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_com_java_base_learn_grpc_demo_StudentResponse(buffer_arg) {
  return proto_Student_pb.StudentResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_com_java_base_learn_grpc_demo_StudentResponseList(arg) {
  if (!(arg instanceof proto_Student_pb.StudentResponseList)) {
    throw new Error('Expected argument of type com.java.base.learn.grpc.demo.StudentResponseList');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_com_java_base_learn_grpc_demo_StudentResponseList(buffer_arg) {
  return proto_Student_pb.StudentResponseList.deserializeBinary(new Uint8Array(buffer_arg));
}


var StudentServiceService = exports.StudentServiceService = {
  getRealNameByUsername: {
    path: '/com.java.base.learn.grpc.demo.StudentService/GetRealNameByUsername',
    requestStream: false,
    responseStream: false,
    requestType: proto_Student_pb.MyRequest,
    responseType: proto_Student_pb.MyResponse,
    requestSerialize: serialize_com_java_base_learn_grpc_demo_MyRequest,
    requestDeserialize: deserialize_com_java_base_learn_grpc_demo_MyRequest,
    responseSerialize: serialize_com_java_base_learn_grpc_demo_MyResponse,
    responseDeserialize: deserialize_com_java_base_learn_grpc_demo_MyResponse,
  },
  getStudentsByAge: {
    path: '/com.java.base.learn.grpc.demo.StudentService/GetStudentsByAge',
    requestStream: false,
    responseStream: true,
    requestType: proto_Student_pb.StudentRequest,
    responseType: proto_Student_pb.StudentResponse,
    requestSerialize: serialize_com_java_base_learn_grpc_demo_StudentRequest,
    requestDeserialize: deserialize_com_java_base_learn_grpc_demo_StudentRequest,
    responseSerialize: serialize_com_java_base_learn_grpc_demo_StudentResponse,
    responseDeserialize: deserialize_com_java_base_learn_grpc_demo_StudentResponse,
  },
  getStudentsWrapperByAges: {
    path: '/com.java.base.learn.grpc.demo.StudentService/GetStudentsWrapperByAges',
    requestStream: true,
    responseStream: false,
    requestType: proto_Student_pb.StudentRequest,
    responseType: proto_Student_pb.StudentResponseList,
    requestSerialize: serialize_com_java_base_learn_grpc_demo_StudentRequest,
    requestDeserialize: deserialize_com_java_base_learn_grpc_demo_StudentRequest,
    responseSerialize: serialize_com_java_base_learn_grpc_demo_StudentResponseList,
    responseDeserialize: deserialize_com_java_base_learn_grpc_demo_StudentResponseList,
  },
  biTalk: {
    path: '/com.java.base.learn.grpc.demo.StudentService/BiTalk',
    requestStream: true,
    responseStream: true,
    requestType: proto_Student_pb.StreamRequest,
    responseType: proto_Student_pb.StreamResponse,
    requestSerialize: serialize_com_java_base_learn_grpc_demo_StreamRequest,
    requestDeserialize: deserialize_com_java_base_learn_grpc_demo_StreamRequest,
    responseSerialize: serialize_com_java_base_learn_grpc_demo_StreamResponse,
    responseDeserialize: deserialize_com_java_base_learn_grpc_demo_StreamResponse,
  },
};

exports.StudentServiceClient = grpc.makeGenericClientConstructor(StudentServiceService);
