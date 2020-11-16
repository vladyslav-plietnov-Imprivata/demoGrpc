package com.pl.demo.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.33.1)",
    comments = "Source: hello.proto")
public final class HelloServiceGrpc {

  private HelloServiceGrpc() {}

  public static final String SERVICE_NAME = "com.pl.demo.grpc.HelloService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.pl.demo.grpc.Hello.GetGreetingRequest,
      com.pl.demo.grpc.Hello.GreetingResponse> getGetGreetingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getGreeting",
      requestType = com.pl.demo.grpc.Hello.GetGreetingRequest.class,
      responseType = com.pl.demo.grpc.Hello.GreetingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.pl.demo.grpc.Hello.GetGreetingRequest,
      com.pl.demo.grpc.Hello.GreetingResponse> getGetGreetingMethod() {
    io.grpc.MethodDescriptor<com.pl.demo.grpc.Hello.GetGreetingRequest, com.pl.demo.grpc.Hello.GreetingResponse> getGetGreetingMethod;
    if ((getGetGreetingMethod = HelloServiceGrpc.getGetGreetingMethod) == null) {
      synchronized (HelloServiceGrpc.class) {
        if ((getGetGreetingMethod = HelloServiceGrpc.getGetGreetingMethod) == null) {
          HelloServiceGrpc.getGetGreetingMethod = getGetGreetingMethod =
              io.grpc.MethodDescriptor.<com.pl.demo.grpc.Hello.GetGreetingRequest, com.pl.demo.grpc.Hello.GreetingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getGreeting"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pl.demo.grpc.Hello.GetGreetingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pl.demo.grpc.Hello.GreetingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HelloServiceMethodDescriptorSupplier("getGreeting"))
              .build();
        }
      }
    }
    return getGetGreetingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.pl.demo.grpc.Hello.CreateGreetingRequest,
      com.pl.demo.grpc.Hello.GreetingResponse> getCreateGreetingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createGreeting",
      requestType = com.pl.demo.grpc.Hello.CreateGreetingRequest.class,
      responseType = com.pl.demo.grpc.Hello.GreetingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.pl.demo.grpc.Hello.CreateGreetingRequest,
      com.pl.demo.grpc.Hello.GreetingResponse> getCreateGreetingMethod() {
    io.grpc.MethodDescriptor<com.pl.demo.grpc.Hello.CreateGreetingRequest, com.pl.demo.grpc.Hello.GreetingResponse> getCreateGreetingMethod;
    if ((getCreateGreetingMethod = HelloServiceGrpc.getCreateGreetingMethod) == null) {
      synchronized (HelloServiceGrpc.class) {
        if ((getCreateGreetingMethod = HelloServiceGrpc.getCreateGreetingMethod) == null) {
          HelloServiceGrpc.getCreateGreetingMethod = getCreateGreetingMethod =
              io.grpc.MethodDescriptor.<com.pl.demo.grpc.Hello.CreateGreetingRequest, com.pl.demo.grpc.Hello.GreetingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "createGreeting"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pl.demo.grpc.Hello.CreateGreetingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pl.demo.grpc.Hello.GreetingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HelloServiceMethodDescriptorSupplier("createGreeting"))
              .build();
        }
      }
    }
    return getCreateGreetingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.pl.demo.grpc.Hello.DeleteGreetingRequest,
      com.pl.demo.grpc.Hello.DeleteGreetingResponse> getDeleteGreetingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteGreeting",
      requestType = com.pl.demo.grpc.Hello.DeleteGreetingRequest.class,
      responseType = com.pl.demo.grpc.Hello.DeleteGreetingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.pl.demo.grpc.Hello.DeleteGreetingRequest,
      com.pl.demo.grpc.Hello.DeleteGreetingResponse> getDeleteGreetingMethod() {
    io.grpc.MethodDescriptor<com.pl.demo.grpc.Hello.DeleteGreetingRequest, com.pl.demo.grpc.Hello.DeleteGreetingResponse> getDeleteGreetingMethod;
    if ((getDeleteGreetingMethod = HelloServiceGrpc.getDeleteGreetingMethod) == null) {
      synchronized (HelloServiceGrpc.class) {
        if ((getDeleteGreetingMethod = HelloServiceGrpc.getDeleteGreetingMethod) == null) {
          HelloServiceGrpc.getDeleteGreetingMethod = getDeleteGreetingMethod =
              io.grpc.MethodDescriptor.<com.pl.demo.grpc.Hello.DeleteGreetingRequest, com.pl.demo.grpc.Hello.DeleteGreetingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deleteGreeting"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pl.demo.grpc.Hello.DeleteGreetingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pl.demo.grpc.Hello.DeleteGreetingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HelloServiceMethodDescriptorSupplier("deleteGreeting"))
              .build();
        }
      }
    }
    return getDeleteGreetingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.pl.demo.grpc.Hello.GetGreetingsRequest,
      com.pl.demo.grpc.Hello.GreetingsResponse> getGetAllGreetingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAllGreetings",
      requestType = com.pl.demo.grpc.Hello.GetGreetingsRequest.class,
      responseType = com.pl.demo.grpc.Hello.GreetingsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.pl.demo.grpc.Hello.GetGreetingsRequest,
      com.pl.demo.grpc.Hello.GreetingsResponse> getGetAllGreetingsMethod() {
    io.grpc.MethodDescriptor<com.pl.demo.grpc.Hello.GetGreetingsRequest, com.pl.demo.grpc.Hello.GreetingsResponse> getGetAllGreetingsMethod;
    if ((getGetAllGreetingsMethod = HelloServiceGrpc.getGetAllGreetingsMethod) == null) {
      synchronized (HelloServiceGrpc.class) {
        if ((getGetAllGreetingsMethod = HelloServiceGrpc.getGetAllGreetingsMethod) == null) {
          HelloServiceGrpc.getGetAllGreetingsMethod = getGetAllGreetingsMethod =
              io.grpc.MethodDescriptor.<com.pl.demo.grpc.Hello.GetGreetingsRequest, com.pl.demo.grpc.Hello.GreetingsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getAllGreetings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pl.demo.grpc.Hello.GetGreetingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pl.demo.grpc.Hello.GreetingsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HelloServiceMethodDescriptorSupplier("getAllGreetings"))
              .build();
        }
      }
    }
    return getGetAllGreetingsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.pl.demo.grpc.Hello.UpdateGreetingRequest,
      com.pl.demo.grpc.Hello.GreetingResponse> getUpdateGreetingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateGreeting",
      requestType = com.pl.demo.grpc.Hello.UpdateGreetingRequest.class,
      responseType = com.pl.demo.grpc.Hello.GreetingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.pl.demo.grpc.Hello.UpdateGreetingRequest,
      com.pl.demo.grpc.Hello.GreetingResponse> getUpdateGreetingMethod() {
    io.grpc.MethodDescriptor<com.pl.demo.grpc.Hello.UpdateGreetingRequest, com.pl.demo.grpc.Hello.GreetingResponse> getUpdateGreetingMethod;
    if ((getUpdateGreetingMethod = HelloServiceGrpc.getUpdateGreetingMethod) == null) {
      synchronized (HelloServiceGrpc.class) {
        if ((getUpdateGreetingMethod = HelloServiceGrpc.getUpdateGreetingMethod) == null) {
          HelloServiceGrpc.getUpdateGreetingMethod = getUpdateGreetingMethod =
              io.grpc.MethodDescriptor.<com.pl.demo.grpc.Hello.UpdateGreetingRequest, com.pl.demo.grpc.Hello.GreetingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateGreeting"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pl.demo.grpc.Hello.UpdateGreetingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.pl.demo.grpc.Hello.GreetingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HelloServiceMethodDescriptorSupplier("UpdateGreeting"))
              .build();
        }
      }
    }
    return getUpdateGreetingMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HelloServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HelloServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HelloServiceStub>() {
        @java.lang.Override
        public HelloServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HelloServiceStub(channel, callOptions);
        }
      };
    return HelloServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HelloServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HelloServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HelloServiceBlockingStub>() {
        @java.lang.Override
        public HelloServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HelloServiceBlockingStub(channel, callOptions);
        }
      };
    return HelloServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static HelloServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HelloServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HelloServiceFutureStub>() {
        @java.lang.Override
        public HelloServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HelloServiceFutureStub(channel, callOptions);
        }
      };
    return HelloServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class HelloServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getGreeting(com.pl.demo.grpc.Hello.GetGreetingRequest request,
        io.grpc.stub.StreamObserver<com.pl.demo.grpc.Hello.GreetingResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetGreetingMethod(), responseObserver);
    }

    /**
     */
    public void createGreeting(com.pl.demo.grpc.Hello.CreateGreetingRequest request,
        io.grpc.stub.StreamObserver<com.pl.demo.grpc.Hello.GreetingResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateGreetingMethod(), responseObserver);
    }

    /**
     */
    public void deleteGreeting(com.pl.demo.grpc.Hello.DeleteGreetingRequest request,
        io.grpc.stub.StreamObserver<com.pl.demo.grpc.Hello.DeleteGreetingResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteGreetingMethod(), responseObserver);
    }

    /**
     */
    public void getAllGreetings(com.pl.demo.grpc.Hello.GetGreetingsRequest request,
        io.grpc.stub.StreamObserver<com.pl.demo.grpc.Hello.GreetingsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllGreetingsMethod(), responseObserver);
    }

    /**
     */
    public void updateGreeting(com.pl.demo.grpc.Hello.UpdateGreetingRequest request,
        io.grpc.stub.StreamObserver<com.pl.demo.grpc.Hello.GreetingResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateGreetingMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetGreetingMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.pl.demo.grpc.Hello.GetGreetingRequest,
                com.pl.demo.grpc.Hello.GreetingResponse>(
                  this, METHODID_GET_GREETING)))
          .addMethod(
            getCreateGreetingMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.pl.demo.grpc.Hello.CreateGreetingRequest,
                com.pl.demo.grpc.Hello.GreetingResponse>(
                  this, METHODID_CREATE_GREETING)))
          .addMethod(
            getDeleteGreetingMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.pl.demo.grpc.Hello.DeleteGreetingRequest,
                com.pl.demo.grpc.Hello.DeleteGreetingResponse>(
                  this, METHODID_DELETE_GREETING)))
          .addMethod(
            getGetAllGreetingsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.pl.demo.grpc.Hello.GetGreetingsRequest,
                com.pl.demo.grpc.Hello.GreetingsResponse>(
                  this, METHODID_GET_ALL_GREETINGS)))
          .addMethod(
            getUpdateGreetingMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.pl.demo.grpc.Hello.UpdateGreetingRequest,
                com.pl.demo.grpc.Hello.GreetingResponse>(
                  this, METHODID_UPDATE_GREETING)))
          .build();
    }
  }

  /**
   */
  public static final class HelloServiceStub extends io.grpc.stub.AbstractAsyncStub<HelloServiceStub> {
    private HelloServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HelloServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HelloServiceStub(channel, callOptions);
    }

    /**
     */
    public void getGreeting(com.pl.demo.grpc.Hello.GetGreetingRequest request,
        io.grpc.stub.StreamObserver<com.pl.demo.grpc.Hello.GreetingResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetGreetingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createGreeting(com.pl.demo.grpc.Hello.CreateGreetingRequest request,
        io.grpc.stub.StreamObserver<com.pl.demo.grpc.Hello.GreetingResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateGreetingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteGreeting(com.pl.demo.grpc.Hello.DeleteGreetingRequest request,
        io.grpc.stub.StreamObserver<com.pl.demo.grpc.Hello.DeleteGreetingResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteGreetingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllGreetings(com.pl.demo.grpc.Hello.GetGreetingsRequest request,
        io.grpc.stub.StreamObserver<com.pl.demo.grpc.Hello.GreetingsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAllGreetingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateGreeting(com.pl.demo.grpc.Hello.UpdateGreetingRequest request,
        io.grpc.stub.StreamObserver<com.pl.demo.grpc.Hello.GreetingResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateGreetingMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class HelloServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<HelloServiceBlockingStub> {
    private HelloServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HelloServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HelloServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.pl.demo.grpc.Hello.GreetingResponse getGreeting(com.pl.demo.grpc.Hello.GetGreetingRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetGreetingMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.pl.demo.grpc.Hello.GreetingResponse createGreeting(com.pl.demo.grpc.Hello.CreateGreetingRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateGreetingMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.pl.demo.grpc.Hello.DeleteGreetingResponse deleteGreeting(com.pl.demo.grpc.Hello.DeleteGreetingRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteGreetingMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.pl.demo.grpc.Hello.GreetingsResponse getAllGreetings(com.pl.demo.grpc.Hello.GetGreetingsRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAllGreetingsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.pl.demo.grpc.Hello.GreetingResponse updateGreeting(com.pl.demo.grpc.Hello.UpdateGreetingRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateGreetingMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class HelloServiceFutureStub extends io.grpc.stub.AbstractFutureStub<HelloServiceFutureStub> {
    private HelloServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HelloServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HelloServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.pl.demo.grpc.Hello.GreetingResponse> getGreeting(
        com.pl.demo.grpc.Hello.GetGreetingRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetGreetingMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.pl.demo.grpc.Hello.GreetingResponse> createGreeting(
        com.pl.demo.grpc.Hello.CreateGreetingRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateGreetingMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.pl.demo.grpc.Hello.DeleteGreetingResponse> deleteGreeting(
        com.pl.demo.grpc.Hello.DeleteGreetingRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteGreetingMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.pl.demo.grpc.Hello.GreetingsResponse> getAllGreetings(
        com.pl.demo.grpc.Hello.GetGreetingsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAllGreetingsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.pl.demo.grpc.Hello.GreetingResponse> updateGreeting(
        com.pl.demo.grpc.Hello.UpdateGreetingRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateGreetingMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_GREETING = 0;
  private static final int METHODID_CREATE_GREETING = 1;
  private static final int METHODID_DELETE_GREETING = 2;
  private static final int METHODID_GET_ALL_GREETINGS = 3;
  private static final int METHODID_UPDATE_GREETING = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final HelloServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(HelloServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_GREETING:
          serviceImpl.getGreeting((com.pl.demo.grpc.Hello.GetGreetingRequest) request,
              (io.grpc.stub.StreamObserver<com.pl.demo.grpc.Hello.GreetingResponse>) responseObserver);
          break;
        case METHODID_CREATE_GREETING:
          serviceImpl.createGreeting((com.pl.demo.grpc.Hello.CreateGreetingRequest) request,
              (io.grpc.stub.StreamObserver<com.pl.demo.grpc.Hello.GreetingResponse>) responseObserver);
          break;
        case METHODID_DELETE_GREETING:
          serviceImpl.deleteGreeting((com.pl.demo.grpc.Hello.DeleteGreetingRequest) request,
              (io.grpc.stub.StreamObserver<com.pl.demo.grpc.Hello.DeleteGreetingResponse>) responseObserver);
          break;
        case METHODID_GET_ALL_GREETINGS:
          serviceImpl.getAllGreetings((com.pl.demo.grpc.Hello.GetGreetingsRequest) request,
              (io.grpc.stub.StreamObserver<com.pl.demo.grpc.Hello.GreetingsResponse>) responseObserver);
          break;
        case METHODID_UPDATE_GREETING:
          serviceImpl.updateGreeting((com.pl.demo.grpc.Hello.UpdateGreetingRequest) request,
              (io.grpc.stub.StreamObserver<com.pl.demo.grpc.Hello.GreetingResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class HelloServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    HelloServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.pl.demo.grpc.Hello.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("HelloService");
    }
  }

  private static final class HelloServiceFileDescriptorSupplier
      extends HelloServiceBaseDescriptorSupplier {
    HelloServiceFileDescriptorSupplier() {}
  }

  private static final class HelloServiceMethodDescriptorSupplier
      extends HelloServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    HelloServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (HelloServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new HelloServiceFileDescriptorSupplier())
              .addMethod(getGetGreetingMethod())
              .addMethod(getCreateGreetingMethod())
              .addMethod(getDeleteGreetingMethod())
              .addMethod(getGetAllGreetingsMethod())
              .addMethod(getUpdateGreetingMethod())
              .build();
        }
      }
    }
    return result;
  }
}