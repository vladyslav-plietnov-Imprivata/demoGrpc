package com.pl.demo.service;

import static com.pl.demo.utils.GrpcUtils.decorateWithServiceUnavailableException;
import static com.pl.demo.grpc.Hello.CreateGreetingRequest;
import static com.pl.demo.grpc.Hello.DeleteGreetingRequest;
import static com.pl.demo.grpc.Hello.GetGreetingRequest;
import static com.pl.demo.grpc.Hello.GetGreetingsRequest;
import static com.pl.demo.grpc.Hello.GreetingResponse;
import static com.pl.demo.grpc.Hello.UpdateGreetingRequest;

import com.pl.demo.dto.HelloDto;
import com.pl.demo.grpc.HelloServiceGrpc.HelloServiceBlockingStub;
import io.github.resilience4j.circuitbreaker.CircuitBreaker;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ServiceBaseImpl {

  private final HelloServiceBlockingStub helloServiceBlockingStub;
  private final CircuitBreaker circuitBreaker;

  public ServiceBaseImpl(HelloServiceBlockingStub helloServiceBlockingStub,
                         CircuitBreaker circuitBreaker) {
    this.helloServiceBlockingStub = helloServiceBlockingStub;
    this.circuitBreaker = circuitBreaker;
  }

  public HelloDto getGreeting(int id) {
    GetGreetingRequest request = GetGreetingRequest.newBuilder()
        .setId(id)
        .build();

    GreetingResponse response = decorateWithServiceUnavailableException(
        circuitBreaker,
        () -> helloServiceBlockingStub.getGreeting(
            request
        ));

    return toHelloDto(response);
  }

  public HelloDto createGreeting(String greeting) {
    CreateGreetingRequest request = CreateGreetingRequest.newBuilder()
        .setGreeting(greeting)
        .build();

    GreetingResponse response = decorateWithServiceUnavailableException(
        circuitBreaker,
        () -> helloServiceBlockingStub.createGreeting(
            request
        ));

    return toHelloDto(response);
  }

  public HelloDto updateGreeting(int id,String greeting) {
    UpdateGreetingRequest request = UpdateGreetingRequest.newBuilder()
        .setId(id)
        .setGreeting(greeting)
        .build();

    GreetingResponse response = decorateWithServiceUnavailableException(
        circuitBreaker,
        () -> helloServiceBlockingStub.updateGreeting(
            request
        ));

    return toHelloDto(response);
  }

  public void deleteGreeting(int id) {
    DeleteGreetingRequest request = DeleteGreetingRequest.newBuilder()
        .setId(id)
        .build();

    decorateWithServiceUnavailableException(
        circuitBreaker,
        () -> helloServiceBlockingStub.deleteGreeting(
            request)
    );
  }

  public List<HelloDto> getAllGreetings() {
    return decorateWithServiceUnavailableException(
        circuitBreaker,
        () -> helloServiceBlockingStub.getAllGreetings(
            GetGreetingsRequest.getDefaultInstance()))
        .getGreetingsList().stream()
        .map(this::toHelloDto)
        .collect(Collectors.toList());
  }

  private HelloDto toHelloDto(GreetingResponse greetingResponse) {
    return HelloDto.builder()
        .id(greetingResponse.getId())
        .value(greetingResponse.getGreeting())
        .build();
  }
}
