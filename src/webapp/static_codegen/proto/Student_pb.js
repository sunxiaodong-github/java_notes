/**
 * @fileoverview
 * @enhanceable
 * @suppress {messageConventions} JS Compiler reports an error if a variable or
 *     field starts with 'MSG_' and isn't a translatable message.
 * @public
 */
// GENERATED CODE -- DO NOT EDIT!

var jspb = require('google-protobuf');
var goog = jspb;
var global = Function('return this')();

goog.exportSymbol('proto.com.java.base.learn.grpc.demo.MyRequest', null, global);
goog.exportSymbol('proto.com.java.base.learn.grpc.demo.MyResponse', null, global);
goog.exportSymbol('proto.com.java.base.learn.grpc.demo.StreamRequest', null, global);
goog.exportSymbol('proto.com.java.base.learn.grpc.demo.StreamResponse', null, global);
goog.exportSymbol('proto.com.java.base.learn.grpc.demo.StudentRequest', null, global);
goog.exportSymbol('proto.com.java.base.learn.grpc.demo.StudentResponse', null, global);
goog.exportSymbol('proto.com.java.base.learn.grpc.demo.StudentResponseList', null, global);

/**
 * Generated by JsPbCodeGenerator.
 * @param {Array=} opt_data Optional initial data array, typically from a
 * server response, or constructed directly in Javascript. The array is used
 * in place and becomes part of the constructed object. It is not cloned.
 * If no data is provided, the constructed object will be empty, but still
 * valid.
 * @extends {jspb.Message}
 * @constructor
 */
proto.com.java.base.learn.grpc.demo.MyRequest = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.com.java.base.learn.grpc.demo.MyRequest, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  proto.com.java.base.learn.grpc.demo.MyRequest.displayName = 'proto.com.java.base.learn.grpc.demo.MyRequest';
}


if (jspb.Message.GENERATE_TO_OBJECT) {
/**
 * Creates an object representation of this proto suitable for use in Soy templates.
 * Field names that are reserved in JavaScript and will be renamed to pb_name.
 * To access a reserved field use, foo.pb_<name>, eg, foo.pb_default.
 * For the list of reserved names please see:
 *     com.google.apps.jspb.JsClassTemplate.JS_RESERVED_WORDS.
 * @param {boolean=} opt_includeInstance Whether to include the JSPB instance
 *     for transitional soy proto support: http://goto/soy-param-migration
 * @return {!Object}
 */
proto.com.java.base.learn.grpc.demo.MyRequest.prototype.toObject = function(opt_includeInstance) {
  return proto.com.java.base.learn.grpc.demo.MyRequest.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Whether to include the JSPB
 *     instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.com.java.base.learn.grpc.demo.MyRequest} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.com.java.base.learn.grpc.demo.MyRequest.toObject = function(includeInstance, msg) {
  var f, obj = {
    username: jspb.Message.getFieldWithDefault(msg, 1, "")
  };

  if (includeInstance) {
    obj.$jspbMessageInstance = msg;
  }
  return obj;
};
}


/**
 * Deserializes binary data (in protobuf wire format).
 * @param {jspb.ByteSource} bytes The bytes to deserialize.
 * @return {!proto.com.java.base.learn.grpc.demo.MyRequest}
 */
proto.com.java.base.learn.grpc.demo.MyRequest.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.com.java.base.learn.grpc.demo.MyRequest;
  return proto.com.java.base.learn.grpc.demo.MyRequest.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.com.java.base.learn.grpc.demo.MyRequest} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.com.java.base.learn.grpc.demo.MyRequest}
 */
proto.com.java.base.learn.grpc.demo.MyRequest.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setUsername(value);
      break;
    default:
      reader.skipField();
      break;
    }
  }
  return msg;
};


/**
 * Serializes the message to binary data (in protobuf wire format).
 * @return {!Uint8Array}
 */
proto.com.java.base.learn.grpc.demo.MyRequest.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.com.java.base.learn.grpc.demo.MyRequest.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.com.java.base.learn.grpc.demo.MyRequest} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.com.java.base.learn.grpc.demo.MyRequest.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getUsername();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
};


/**
 * optional string username = 1;
 * @return {string}
 */
proto.com.java.base.learn.grpc.demo.MyRequest.prototype.getUsername = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/** @param {string} value */
proto.com.java.base.learn.grpc.demo.MyRequest.prototype.setUsername = function(value) {
  jspb.Message.setProto3StringField(this, 1, value);
};



/**
 * Generated by JsPbCodeGenerator.
 * @param {Array=} opt_data Optional initial data array, typically from a
 * server response, or constructed directly in Javascript. The array is used
 * in place and becomes part of the constructed object. It is not cloned.
 * If no data is provided, the constructed object will be empty, but still
 * valid.
 * @extends {jspb.Message}
 * @constructor
 */
proto.com.java.base.learn.grpc.demo.MyResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.com.java.base.learn.grpc.demo.MyResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  proto.com.java.base.learn.grpc.demo.MyResponse.displayName = 'proto.com.java.base.learn.grpc.demo.MyResponse';
}


if (jspb.Message.GENERATE_TO_OBJECT) {
/**
 * Creates an object representation of this proto suitable for use in Soy templates.
 * Field names that are reserved in JavaScript and will be renamed to pb_name.
 * To access a reserved field use, foo.pb_<name>, eg, foo.pb_default.
 * For the list of reserved names please see:
 *     com.google.apps.jspb.JsClassTemplate.JS_RESERVED_WORDS.
 * @param {boolean=} opt_includeInstance Whether to include the JSPB instance
 *     for transitional soy proto support: http://goto/soy-param-migration
 * @return {!Object}
 */
proto.com.java.base.learn.grpc.demo.MyResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.com.java.base.learn.grpc.demo.MyResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Whether to include the JSPB
 *     instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.com.java.base.learn.grpc.demo.MyResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.com.java.base.learn.grpc.demo.MyResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    realname: jspb.Message.getFieldWithDefault(msg, 1, "")
  };

  if (includeInstance) {
    obj.$jspbMessageInstance = msg;
  }
  return obj;
};
}


/**
 * Deserializes binary data (in protobuf wire format).
 * @param {jspb.ByteSource} bytes The bytes to deserialize.
 * @return {!proto.com.java.base.learn.grpc.demo.MyResponse}
 */
proto.com.java.base.learn.grpc.demo.MyResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.com.java.base.learn.grpc.demo.MyResponse;
  return proto.com.java.base.learn.grpc.demo.MyResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.com.java.base.learn.grpc.demo.MyResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.com.java.base.learn.grpc.demo.MyResponse}
 */
proto.com.java.base.learn.grpc.demo.MyResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setRealname(value);
      break;
    default:
      reader.skipField();
      break;
    }
  }
  return msg;
};


/**
 * Serializes the message to binary data (in protobuf wire format).
 * @return {!Uint8Array}
 */
proto.com.java.base.learn.grpc.demo.MyResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.com.java.base.learn.grpc.demo.MyResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.com.java.base.learn.grpc.demo.MyResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.com.java.base.learn.grpc.demo.MyResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getRealname();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
};


/**
 * optional string realname = 1;
 * @return {string}
 */
proto.com.java.base.learn.grpc.demo.MyResponse.prototype.getRealname = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/** @param {string} value */
proto.com.java.base.learn.grpc.demo.MyResponse.prototype.setRealname = function(value) {
  jspb.Message.setProto3StringField(this, 1, value);
};



/**
 * Generated by JsPbCodeGenerator.
 * @param {Array=} opt_data Optional initial data array, typically from a
 * server response, or constructed directly in Javascript. The array is used
 * in place and becomes part of the constructed object. It is not cloned.
 * If no data is provided, the constructed object will be empty, but still
 * valid.
 * @extends {jspb.Message}
 * @constructor
 */
proto.com.java.base.learn.grpc.demo.StudentRequest = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.com.java.base.learn.grpc.demo.StudentRequest, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  proto.com.java.base.learn.grpc.demo.StudentRequest.displayName = 'proto.com.java.base.learn.grpc.demo.StudentRequest';
}


if (jspb.Message.GENERATE_TO_OBJECT) {
/**
 * Creates an object representation of this proto suitable for use in Soy templates.
 * Field names that are reserved in JavaScript and will be renamed to pb_name.
 * To access a reserved field use, foo.pb_<name>, eg, foo.pb_default.
 * For the list of reserved names please see:
 *     com.google.apps.jspb.JsClassTemplate.JS_RESERVED_WORDS.
 * @param {boolean=} opt_includeInstance Whether to include the JSPB instance
 *     for transitional soy proto support: http://goto/soy-param-migration
 * @return {!Object}
 */
proto.com.java.base.learn.grpc.demo.StudentRequest.prototype.toObject = function(opt_includeInstance) {
  return proto.com.java.base.learn.grpc.demo.StudentRequest.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Whether to include the JSPB
 *     instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.com.java.base.learn.grpc.demo.StudentRequest} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.com.java.base.learn.grpc.demo.StudentRequest.toObject = function(includeInstance, msg) {
  var f, obj = {
    age: jspb.Message.getFieldWithDefault(msg, 1, 0)
  };

  if (includeInstance) {
    obj.$jspbMessageInstance = msg;
  }
  return obj;
};
}


/**
 * Deserializes binary data (in protobuf wire format).
 * @param {jspb.ByteSource} bytes The bytes to deserialize.
 * @return {!proto.com.java.base.learn.grpc.demo.StudentRequest}
 */
proto.com.java.base.learn.grpc.demo.StudentRequest.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.com.java.base.learn.grpc.demo.StudentRequest;
  return proto.com.java.base.learn.grpc.demo.StudentRequest.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.com.java.base.learn.grpc.demo.StudentRequest} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.com.java.base.learn.grpc.demo.StudentRequest}
 */
proto.com.java.base.learn.grpc.demo.StudentRequest.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {number} */ (reader.readInt32());
      msg.setAge(value);
      break;
    default:
      reader.skipField();
      break;
    }
  }
  return msg;
};


/**
 * Serializes the message to binary data (in protobuf wire format).
 * @return {!Uint8Array}
 */
proto.com.java.base.learn.grpc.demo.StudentRequest.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.com.java.base.learn.grpc.demo.StudentRequest.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.com.java.base.learn.grpc.demo.StudentRequest} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.com.java.base.learn.grpc.demo.StudentRequest.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getAge();
  if (f !== 0) {
    writer.writeInt32(
      1,
      f
    );
  }
};


/**
 * optional int32 age = 1;
 * @return {number}
 */
proto.com.java.base.learn.grpc.demo.StudentRequest.prototype.getAge = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 1, 0));
};


/** @param {number} value */
proto.com.java.base.learn.grpc.demo.StudentRequest.prototype.setAge = function(value) {
  jspb.Message.setProto3IntField(this, 1, value);
};



/**
 * Generated by JsPbCodeGenerator.
 * @param {Array=} opt_data Optional initial data array, typically from a
 * server response, or constructed directly in Javascript. The array is used
 * in place and becomes part of the constructed object. It is not cloned.
 * If no data is provided, the constructed object will be empty, but still
 * valid.
 * @extends {jspb.Message}
 * @constructor
 */
proto.com.java.base.learn.grpc.demo.StudentResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.com.java.base.learn.grpc.demo.StudentResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  proto.com.java.base.learn.grpc.demo.StudentResponse.displayName = 'proto.com.java.base.learn.grpc.demo.StudentResponse';
}


if (jspb.Message.GENERATE_TO_OBJECT) {
/**
 * Creates an object representation of this proto suitable for use in Soy templates.
 * Field names that are reserved in JavaScript and will be renamed to pb_name.
 * To access a reserved field use, foo.pb_<name>, eg, foo.pb_default.
 * For the list of reserved names please see:
 *     com.google.apps.jspb.JsClassTemplate.JS_RESERVED_WORDS.
 * @param {boolean=} opt_includeInstance Whether to include the JSPB instance
 *     for transitional soy proto support: http://goto/soy-param-migration
 * @return {!Object}
 */
proto.com.java.base.learn.grpc.demo.StudentResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.com.java.base.learn.grpc.demo.StudentResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Whether to include the JSPB
 *     instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.com.java.base.learn.grpc.demo.StudentResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.com.java.base.learn.grpc.demo.StudentResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    name: jspb.Message.getFieldWithDefault(msg, 1, ""),
    age: jspb.Message.getFieldWithDefault(msg, 2, 0),
    city: jspb.Message.getFieldWithDefault(msg, 3, "")
  };

  if (includeInstance) {
    obj.$jspbMessageInstance = msg;
  }
  return obj;
};
}


/**
 * Deserializes binary data (in protobuf wire format).
 * @param {jspb.ByteSource} bytes The bytes to deserialize.
 * @return {!proto.com.java.base.learn.grpc.demo.StudentResponse}
 */
proto.com.java.base.learn.grpc.demo.StudentResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.com.java.base.learn.grpc.demo.StudentResponse;
  return proto.com.java.base.learn.grpc.demo.StudentResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.com.java.base.learn.grpc.demo.StudentResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.com.java.base.learn.grpc.demo.StudentResponse}
 */
proto.com.java.base.learn.grpc.demo.StudentResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setName(value);
      break;
    case 2:
      var value = /** @type {number} */ (reader.readInt32());
      msg.setAge(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setCity(value);
      break;
    default:
      reader.skipField();
      break;
    }
  }
  return msg;
};


/**
 * Serializes the message to binary data (in protobuf wire format).
 * @return {!Uint8Array}
 */
proto.com.java.base.learn.grpc.demo.StudentResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.com.java.base.learn.grpc.demo.StudentResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.com.java.base.learn.grpc.demo.StudentResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.com.java.base.learn.grpc.demo.StudentResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getName();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getAge();
  if (f !== 0) {
    writer.writeInt32(
      2,
      f
    );
  }
  f = message.getCity();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
};


/**
 * optional string name = 1;
 * @return {string}
 */
proto.com.java.base.learn.grpc.demo.StudentResponse.prototype.getName = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/** @param {string} value */
proto.com.java.base.learn.grpc.demo.StudentResponse.prototype.setName = function(value) {
  jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional int32 age = 2;
 * @return {number}
 */
proto.com.java.base.learn.grpc.demo.StudentResponse.prototype.getAge = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 2, 0));
};


/** @param {number} value */
proto.com.java.base.learn.grpc.demo.StudentResponse.prototype.setAge = function(value) {
  jspb.Message.setProto3IntField(this, 2, value);
};


/**
 * optional string city = 3;
 * @return {string}
 */
proto.com.java.base.learn.grpc.demo.StudentResponse.prototype.getCity = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/** @param {string} value */
proto.com.java.base.learn.grpc.demo.StudentResponse.prototype.setCity = function(value) {
  jspb.Message.setProto3StringField(this, 3, value);
};



/**
 * Generated by JsPbCodeGenerator.
 * @param {Array=} opt_data Optional initial data array, typically from a
 * server response, or constructed directly in Javascript. The array is used
 * in place and becomes part of the constructed object. It is not cloned.
 * If no data is provided, the constructed object will be empty, but still
 * valid.
 * @extends {jspb.Message}
 * @constructor
 */
proto.com.java.base.learn.grpc.demo.StudentResponseList = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.com.java.base.learn.grpc.demo.StudentResponseList.repeatedFields_, null);
};
goog.inherits(proto.com.java.base.learn.grpc.demo.StudentResponseList, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  proto.com.java.base.learn.grpc.demo.StudentResponseList.displayName = 'proto.com.java.base.learn.grpc.demo.StudentResponseList';
}
/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.com.java.base.learn.grpc.demo.StudentResponseList.repeatedFields_ = [1];



if (jspb.Message.GENERATE_TO_OBJECT) {
/**
 * Creates an object representation of this proto suitable for use in Soy templates.
 * Field names that are reserved in JavaScript and will be renamed to pb_name.
 * To access a reserved field use, foo.pb_<name>, eg, foo.pb_default.
 * For the list of reserved names please see:
 *     com.google.apps.jspb.JsClassTemplate.JS_RESERVED_WORDS.
 * @param {boolean=} opt_includeInstance Whether to include the JSPB instance
 *     for transitional soy proto support: http://goto/soy-param-migration
 * @return {!Object}
 */
proto.com.java.base.learn.grpc.demo.StudentResponseList.prototype.toObject = function(opt_includeInstance) {
  return proto.com.java.base.learn.grpc.demo.StudentResponseList.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Whether to include the JSPB
 *     instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.com.java.base.learn.grpc.demo.StudentResponseList} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.com.java.base.learn.grpc.demo.StudentResponseList.toObject = function(includeInstance, msg) {
  var f, obj = {
    studentresponseList: jspb.Message.toObjectList(msg.getStudentresponseList(),
    proto.com.java.base.learn.grpc.demo.StudentResponse.toObject, includeInstance)
  };

  if (includeInstance) {
    obj.$jspbMessageInstance = msg;
  }
  return obj;
};
}


/**
 * Deserializes binary data (in protobuf wire format).
 * @param {jspb.ByteSource} bytes The bytes to deserialize.
 * @return {!proto.com.java.base.learn.grpc.demo.StudentResponseList}
 */
proto.com.java.base.learn.grpc.demo.StudentResponseList.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.com.java.base.learn.grpc.demo.StudentResponseList;
  return proto.com.java.base.learn.grpc.demo.StudentResponseList.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.com.java.base.learn.grpc.demo.StudentResponseList} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.com.java.base.learn.grpc.demo.StudentResponseList}
 */
proto.com.java.base.learn.grpc.demo.StudentResponseList.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.com.java.base.learn.grpc.demo.StudentResponse;
      reader.readMessage(value,proto.com.java.base.learn.grpc.demo.StudentResponse.deserializeBinaryFromReader);
      msg.addStudentresponse(value);
      break;
    default:
      reader.skipField();
      break;
    }
  }
  return msg;
};


/**
 * Serializes the message to binary data (in protobuf wire format).
 * @return {!Uint8Array}
 */
proto.com.java.base.learn.grpc.demo.StudentResponseList.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.com.java.base.learn.grpc.demo.StudentResponseList.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.com.java.base.learn.grpc.demo.StudentResponseList} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.com.java.base.learn.grpc.demo.StudentResponseList.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getStudentresponseList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      1,
      f,
      proto.com.java.base.learn.grpc.demo.StudentResponse.serializeBinaryToWriter
    );
  }
};


/**
 * repeated StudentResponse studentResponse = 1;
 * @return {!Array<!proto.com.java.base.learn.grpc.demo.StudentResponse>}
 */
proto.com.java.base.learn.grpc.demo.StudentResponseList.prototype.getStudentresponseList = function() {
  return /** @type{!Array<!proto.com.java.base.learn.grpc.demo.StudentResponse>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.com.java.base.learn.grpc.demo.StudentResponse, 1));
};


/** @param {!Array<!proto.com.java.base.learn.grpc.demo.StudentResponse>} value */
proto.com.java.base.learn.grpc.demo.StudentResponseList.prototype.setStudentresponseList = function(value) {
  jspb.Message.setRepeatedWrapperField(this, 1, value);
};


/**
 * @param {!proto.com.java.base.learn.grpc.demo.StudentResponse=} opt_value
 * @param {number=} opt_index
 * @return {!proto.com.java.base.learn.grpc.demo.StudentResponse}
 */
proto.com.java.base.learn.grpc.demo.StudentResponseList.prototype.addStudentresponse = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 1, opt_value, proto.com.java.base.learn.grpc.demo.StudentResponse, opt_index);
};


proto.com.java.base.learn.grpc.demo.StudentResponseList.prototype.clearStudentresponseList = function() {
  this.setStudentresponseList([]);
};



/**
 * Generated by JsPbCodeGenerator.
 * @param {Array=} opt_data Optional initial data array, typically from a
 * server response, or constructed directly in Javascript. The array is used
 * in place and becomes part of the constructed object. It is not cloned.
 * If no data is provided, the constructed object will be empty, but still
 * valid.
 * @extends {jspb.Message}
 * @constructor
 */
proto.com.java.base.learn.grpc.demo.StreamRequest = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.com.java.base.learn.grpc.demo.StreamRequest, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  proto.com.java.base.learn.grpc.demo.StreamRequest.displayName = 'proto.com.java.base.learn.grpc.demo.StreamRequest';
}


if (jspb.Message.GENERATE_TO_OBJECT) {
/**
 * Creates an object representation of this proto suitable for use in Soy templates.
 * Field names that are reserved in JavaScript and will be renamed to pb_name.
 * To access a reserved field use, foo.pb_<name>, eg, foo.pb_default.
 * For the list of reserved names please see:
 *     com.google.apps.jspb.JsClassTemplate.JS_RESERVED_WORDS.
 * @param {boolean=} opt_includeInstance Whether to include the JSPB instance
 *     for transitional soy proto support: http://goto/soy-param-migration
 * @return {!Object}
 */
proto.com.java.base.learn.grpc.demo.StreamRequest.prototype.toObject = function(opt_includeInstance) {
  return proto.com.java.base.learn.grpc.demo.StreamRequest.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Whether to include the JSPB
 *     instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.com.java.base.learn.grpc.demo.StreamRequest} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.com.java.base.learn.grpc.demo.StreamRequest.toObject = function(includeInstance, msg) {
  var f, obj = {
    requestInfo: jspb.Message.getFieldWithDefault(msg, 1, "")
  };

  if (includeInstance) {
    obj.$jspbMessageInstance = msg;
  }
  return obj;
};
}


/**
 * Deserializes binary data (in protobuf wire format).
 * @param {jspb.ByteSource} bytes The bytes to deserialize.
 * @return {!proto.com.java.base.learn.grpc.demo.StreamRequest}
 */
proto.com.java.base.learn.grpc.demo.StreamRequest.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.com.java.base.learn.grpc.demo.StreamRequest;
  return proto.com.java.base.learn.grpc.demo.StreamRequest.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.com.java.base.learn.grpc.demo.StreamRequest} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.com.java.base.learn.grpc.demo.StreamRequest}
 */
proto.com.java.base.learn.grpc.demo.StreamRequest.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setRequestInfo(value);
      break;
    default:
      reader.skipField();
      break;
    }
  }
  return msg;
};


/**
 * Serializes the message to binary data (in protobuf wire format).
 * @return {!Uint8Array}
 */
proto.com.java.base.learn.grpc.demo.StreamRequest.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.com.java.base.learn.grpc.demo.StreamRequest.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.com.java.base.learn.grpc.demo.StreamRequest} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.com.java.base.learn.grpc.demo.StreamRequest.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getRequestInfo();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
};


/**
 * optional string request_info = 1;
 * @return {string}
 */
proto.com.java.base.learn.grpc.demo.StreamRequest.prototype.getRequestInfo = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/** @param {string} value */
proto.com.java.base.learn.grpc.demo.StreamRequest.prototype.setRequestInfo = function(value) {
  jspb.Message.setProto3StringField(this, 1, value);
};



/**
 * Generated by JsPbCodeGenerator.
 * @param {Array=} opt_data Optional initial data array, typically from a
 * server response, or constructed directly in Javascript. The array is used
 * in place and becomes part of the constructed object. It is not cloned.
 * If no data is provided, the constructed object will be empty, but still
 * valid.
 * @extends {jspb.Message}
 * @constructor
 */
proto.com.java.base.learn.grpc.demo.StreamResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.com.java.base.learn.grpc.demo.StreamResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  proto.com.java.base.learn.grpc.demo.StreamResponse.displayName = 'proto.com.java.base.learn.grpc.demo.StreamResponse';
}


if (jspb.Message.GENERATE_TO_OBJECT) {
/**
 * Creates an object representation of this proto suitable for use in Soy templates.
 * Field names that are reserved in JavaScript and will be renamed to pb_name.
 * To access a reserved field use, foo.pb_<name>, eg, foo.pb_default.
 * For the list of reserved names please see:
 *     com.google.apps.jspb.JsClassTemplate.JS_RESERVED_WORDS.
 * @param {boolean=} opt_includeInstance Whether to include the JSPB instance
 *     for transitional soy proto support: http://goto/soy-param-migration
 * @return {!Object}
 */
proto.com.java.base.learn.grpc.demo.StreamResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.com.java.base.learn.grpc.demo.StreamResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Whether to include the JSPB
 *     instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.com.java.base.learn.grpc.demo.StreamResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.com.java.base.learn.grpc.demo.StreamResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    responseInfo: jspb.Message.getFieldWithDefault(msg, 1, "")
  };

  if (includeInstance) {
    obj.$jspbMessageInstance = msg;
  }
  return obj;
};
}


/**
 * Deserializes binary data (in protobuf wire format).
 * @param {jspb.ByteSource} bytes The bytes to deserialize.
 * @return {!proto.com.java.base.learn.grpc.demo.StreamResponse}
 */
proto.com.java.base.learn.grpc.demo.StreamResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.com.java.base.learn.grpc.demo.StreamResponse;
  return proto.com.java.base.learn.grpc.demo.StreamResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.com.java.base.learn.grpc.demo.StreamResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.com.java.base.learn.grpc.demo.StreamResponse}
 */
proto.com.java.base.learn.grpc.demo.StreamResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setResponseInfo(value);
      break;
    default:
      reader.skipField();
      break;
    }
  }
  return msg;
};


/**
 * Serializes the message to binary data (in protobuf wire format).
 * @return {!Uint8Array}
 */
proto.com.java.base.learn.grpc.demo.StreamResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.com.java.base.learn.grpc.demo.StreamResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.com.java.base.learn.grpc.demo.StreamResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.com.java.base.learn.grpc.demo.StreamResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getResponseInfo();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
};


/**
 * optional string response_info = 1;
 * @return {string}
 */
proto.com.java.base.learn.grpc.demo.StreamResponse.prototype.getResponseInfo = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/** @param {string} value */
proto.com.java.base.learn.grpc.demo.StreamResponse.prototype.setResponseInfo = function(value) {
  jspb.Message.setProto3StringField(this, 1, value);
};


goog.object.extend(exports, proto.com.java.base.learn.grpc.demo);
