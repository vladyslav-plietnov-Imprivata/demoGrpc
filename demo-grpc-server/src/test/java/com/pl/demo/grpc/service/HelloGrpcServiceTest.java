package com.pl.demo.grpc.service;

import static com.pl.demo.TestUtils.verifyGrpc;
import static com.pl.demo.TestUtils.verifyGrpcError;
import static com.pl.demo.grpc.Hello.CreateGreetingRequest;
import static com.pl.demo.grpc.Hello.DeleteGreetingRequest;
import static com.pl.demo.grpc.Hello.DeleteGreetingResponse;
import static com.pl.demo.grpc.Hello.GetGreetingRequest;
import static com.pl.demo.grpc.Hello.GetGreetingsRequest;
import static com.pl.demo.grpc.Hello.GreetingResponse;
import static com.pl.demo.grpc.Hello.GreetingsResponse;
import static com.pl.demo.grpc.Hello.UpdateGreetingRequest;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;

import com.pl.demo.dto.HelloDto;
import com.pl.demo.service.HelloService;
import io.grpc.stub.StreamObserver;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import java.util.List;

public class HelloGrpcServiceTest {

  private HelloGrpcService helloGrpcService;
  @Mock
  private HelloService helloService;
  @Mock
  private StreamObserver<GreetingResponse> greetingResponseObserver;
  @Mock
  private StreamObserver<DeleteGreetingResponse> deleteGreetingResponseObserver;
  @Mock
  private StreamObserver<GreetingsResponse> greetingsResponseObserver;

  @BeforeEach
  public void setUp() {
    initMocks(this);
    helloGrpcService = new HelloGrpcService(helloService);
  }

  @Test
  public void get_successFlow() {
    when(helloService.get(1))
        .thenReturn(HelloDto.builder().id(1).value("hello").build());

    helloGrpcService.getGreeting(
        GetGreetingRequest.newBuilder().setId(1).build(),
        greetingResponseObserver);

    GreetingResponse result = GreetingResponse.newBuilder()
        .setId(1)
        .setGreeting("hello")
        .build();

    verifyGrpc(result, greetingResponseObserver);
  }

  @Test
  public void get_whenInvalidInput_shouldReturnError() {
    helloGrpcService.getGreeting(
        GetGreetingRequest.newBuilder().setId(0).build(),
        greetingResponseObserver);

    verifyGrpcError(new IllegalArgumentException(), greetingResponseObserver);
  }

  @Test
  public void createGreeting_successFlow() {
    when(helloService.createGreeting("hello"))
        .thenReturn(HelloDto.builder().id(1).value("hello").build());

    helloGrpcService.createGreeting(
        CreateGreetingRequest.newBuilder().setGreeting("hello").build(),
        greetingResponseObserver
    );

    GreetingResponse result = GreetingResponse.newBuilder()
        .setId(1)
        .setGreeting("hello")
        .build();

    verifyGrpc(result, greetingResponseObserver);
  }

  @Test
  public void createGreeting_whenInputIsEmpty_ShouldReturnError() {
    helloGrpcService.createGreeting(
        CreateGreetingRequest.getDefaultInstance(),
        greetingResponseObserver
    );

    verifyGrpcError(new IllegalArgumentException(), greetingResponseObserver);
  }

  @Test
  public void deleteGreeting_successFlow() {
    helloGrpcService.deleteGreeting(
        DeleteGreetingRequest.newBuilder().setId(1).build(),
        deleteGreetingResponseObserver
    );

    verify(helloService).delete(1);
    verifyGrpc(
        DeleteGreetingResponse.getDefaultInstance(),
        deleteGreetingResponseObserver
    );
  }

  @Test
  public void deleteGreeting_whenInputIsEmpty_shouldReturnError() {
    helloGrpcService.deleteGreeting(
        DeleteGreetingRequest.getDefaultInstance(),
        deleteGreetingResponseObserver
    );

    verifyGrpcError(
        new IllegalArgumentException(),
        deleteGreetingResponseObserver
    );
  }

  @Test
  public void getAllGreetings_successFlow() {
    when(helloService.getAll())
        .thenReturn(List.of(
            HelloDto.builder().id(1).value("hello").build(),
            HelloDto.builder().id(2).value("hello2").build())
        );

    helloGrpcService.getAllGreetings(
        GetGreetingsRequest.getDefaultInstance(),
        greetingsResponseObserver
    );

    GreetingsResponse result = GreetingsResponse.newBuilder()
        .addGreetings(GreetingResponse.newBuilder().setId(1).setGreeting("hello").build())
        .addGreetings(GreetingResponse.newBuilder().setId(2).setGreeting("hello2").build())
        .build();

    verifyGrpc(result, greetingsResponseObserver);
  }

  @Test
  public void updateGreeting() {
    when(helloService.updateGreeting(1, "hello"))
        .thenReturn(HelloDto.builder().id(1).value("hello").build());

    helloGrpcService.updateGreeting(
        UpdateGreetingRequest.newBuilder().setId(1).setGreeting("hello").build(),
        greetingResponseObserver
    );

    GreetingResponse result = GreetingResponse.newBuilder()
        .setId(1)
        .setGreeting("hello")
        .build();

    verifyGrpc(result, greetingResponseObserver);
  }

  @Test
  public void updateGreeting_whenInputIsEmpty_shouldReturnError() {
    helloGrpcService.updateGreeting(
        UpdateGreetingRequest.getDefaultInstance(),
        greetingResponseObserver
    );

    GreetingResponse result = GreetingResponse.newBuilder()
        .setId(1)
        .setGreeting("hello")
        .build();

    verifyGrpcError(new IllegalArgumentException(), greetingResponseObserver);
  }
}
