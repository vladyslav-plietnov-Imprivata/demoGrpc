package com.pl.demo.grpc.service;

import static com.pl.demo.grpc.Hello.CreateGreetingRequest;
import static com.pl.demo.grpc.Hello.DeleteGreetingRequest;
import static com.pl.demo.grpc.Hello.DeleteGreetingResponse;
import static com.pl.demo.grpc.Hello.GetGreetingRequest;
import static com.pl.demo.grpc.Hello.GetGreetingsRequest;
import static com.pl.demo.grpc.Hello.GreetingsResponse;
import static com.pl.demo.grpc.Hello.UpdateGreetingRequest;
import static java.util.stream.Collectors.toList;

import com.pl.demo.dto.HelloDto;
import com.pl.demo.grpc.Hello.GreetingResponse;
import com.pl.demo.grpc.HelloServiceGrpc;
import com.pl.demo.service.HelloService;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;

import java.util.List;

@GRpcService
public class HelloGrpcService extends HelloServiceGrpc.HelloServiceImplBase {

  private final HelloService helloService;

  public HelloGrpcService(HelloService helloService) {
    this.helloService = helloService;
  }

  @Override
  public void getGreeting(
      GetGreetingRequest request,
      StreamObserver<GreetingResponse> responseObserver
  ) {
    if (request.equals(request.getDefaultInstanceForType())) {
      responseObserver.onError(new IllegalArgumentException("invalid greeting id"));
    } else {
      HelloDto helloDto = helloService.get(request.getId());
      GreetingResponse response = toGreetingResponse(helloDto);
      responseObserver.onNext(response);
      responseObserver.onCompleted();
    }
  }

  @Override
  public void createGreeting(
      CreateGreetingRequest request,
      StreamObserver<GreetingResponse> responseObserver
  ) {
    if (request.equals(request.getDefaultInstanceForType())) {
      responseObserver.onError(new IllegalArgumentException("invalid greeting"));
    } else {
      HelloDto helloDto = helloService.createGreeting(request.getGreeting());
      responseObserver.onNext(toGreetingResponse(helloDto));
      responseObserver.onCompleted();
    }
  }

  @Override
  public void deleteGreeting(
      DeleteGreetingRequest request,
      StreamObserver<DeleteGreetingResponse> responseObserver
  ) {
    if (request.equals(request.getDefaultInstanceForType())) {
      responseObserver.onError(new IllegalArgumentException("invalid greeting id"));
    } else {
      helloService.delete(request.getId());
      responseObserver.onNext(DeleteGreetingResponse.getDefaultInstance());
      responseObserver.onCompleted();
    }
  }

  @Override
  public void getAllGreetings(
      GetGreetingsRequest request,
      StreamObserver<GreetingsResponse> responseObserver
  ) {
    List<GreetingResponse> result = helloService.getAll()
        .stream().map(this::toGreetingResponse)
        .collect(toList());

    GreetingsResponse response = GreetingsResponse.newBuilder()
        .addAllGreetings(result)
        .build();

    responseObserver.onNext(response);
    responseObserver.onCompleted();
  }

  @Override
  public void updateGreeting(
      UpdateGreetingRequest request,
      StreamObserver<GreetingResponse> responseObserver
  ) {
    if (request.equals(request.getDefaultInstanceForType())) {
      responseObserver.onError(new IllegalArgumentException("invalid greeting id"));
    } else {
      HelloDto helloDto = helloService.updateGreeting(request.getId(), request.getGreeting());
      responseObserver.onNext(toGreetingResponse(helloDto));
      responseObserver.onCompleted();
    }
  }

  private GreetingResponse toGreetingResponse(HelloDto helloDto) {
    return GreetingResponse.newBuilder()
        .setId(helloDto.getId())
        .setGreeting(helloDto.getValue())
        .build();
  }
}
