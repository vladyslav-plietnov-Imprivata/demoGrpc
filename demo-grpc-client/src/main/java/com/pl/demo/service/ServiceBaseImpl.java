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
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

@Service
public class ServiceBaseImpl implements ServiceBase {

    private final HelloServiceBlockingStub helloServiceBlockingStub;
    private final CircuitBreaker circuitBreaker;
    private final Integer DEAD_LINE_SECONDS;

    public ServiceBaseImpl(
        HelloServiceBlockingStub helloServiceBlockingStub,
        CircuitBreaker circuitBreaker,
        @Value("${grpc.deadline:5}") int DEAD_LINE_SECONDS
    ) {
        this.helloServiceBlockingStub = helloServiceBlockingStub;
        this.circuitBreaker = circuitBreaker;
        this.DEAD_LINE_SECONDS = DEAD_LINE_SECONDS;
    }

    @Override
    public HelloDto getGreeting(int id) {
        GetGreetingRequest request = GetGreetingRequest.newBuilder()
            .setId(id)
            .build();

        GreetingResponse response = decorateWithServiceUnavailableException(
            circuitBreaker,
            () -> helloServiceBlockingStub.withDeadlineAfter(DEAD_LINE_SECONDS, TimeUnit.SECONDS)
                .getGreeting(
                    request
                ));

        return toHelloDto(response);
    }

    @Override
    public HelloDto createGreeting(String greeting) {
        CreateGreetingRequest request = CreateGreetingRequest.newBuilder()
            .setGreeting(greeting)
            .build();

        GreetingResponse response = decorateWithServiceUnavailableException(
            circuitBreaker,
            () -> helloServiceBlockingStub.withDeadlineAfter(5, TimeUnit.SECONDS)
                .createGreeting(
                    request
                ));

        return toHelloDto(response);
    }

    @Override
    public HelloDto updateGreeting(int id, String greeting) {
        UpdateGreetingRequest request = UpdateGreetingRequest.newBuilder()
            .setId(id)
            .setGreeting(greeting)
            .build();

        GreetingResponse response = decorateWithServiceUnavailableException(
            circuitBreaker,
            () -> helloServiceBlockingStub.withDeadlineAfter(5, TimeUnit.SECONDS)
                .updateGreeting(
                    request
                ));

        return toHelloDto(response);
    }

    @Override
    public void deleteGreeting(int id) {
        DeleteGreetingRequest request = DeleteGreetingRequest.newBuilder()
            .setId(id)
            .build();

        decorateWithServiceUnavailableException(
            circuitBreaker,
            () -> helloServiceBlockingStub.withDeadlineAfter(5, TimeUnit.SECONDS)
                .deleteGreeting(
                    request)
        );
    }

    @Override
    public List<HelloDto> getAllGreetings() {
        return decorateWithServiceUnavailableException(
            circuitBreaker,
            () -> helloServiceBlockingStub.withDeadlineAfter(5, TimeUnit.SECONDS)
                .getAllGreetings(
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
