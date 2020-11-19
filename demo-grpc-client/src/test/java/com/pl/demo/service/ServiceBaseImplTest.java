package com.pl.demo.service;

import com.pl.demo.dto.HelloDto;
import io.github.resilience4j.circuitbreaker.CircuitBreaker;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static com.pl.demo.grpc.Hello.DeleteGreetingRequest;
import static com.pl.demo.grpc.Hello.DeleteGreetingResponse;
import static com.pl.demo.grpc.Hello.GetGreetingRequest;
import static com.pl.demo.grpc.Hello.GreetingResponse;
import static com.pl.demo.grpc.Hello.UpdateGreetingRequest;
import static com.pl.demo.grpc.HelloServiceGrpc.HelloServiceBlockingStub;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;

public class ServiceBaseImplTest {

    @Mock
    private HelloServiceBlockingStub helloServiceBlockingStub;

    private ServiceBaseImpl serviceBase;

    @BeforeEach
    public void setUp() {
        initMocks(this);
        serviceBase = new ServiceBaseImpl(
            helloServiceBlockingStub,
            CircuitBreaker.ofDefaults("hello-service"),
            5
        );
        when(helloServiceBlockingStub.withDeadlineAfter(anyLong(), any())).thenReturn(helloServiceBlockingStub);
    }

    @Test
    public void getGreeting_successFlow() {
        GetGreetingRequest request = GetGreetingRequest.newBuilder()
            .setId(1)
            .build();
        GreetingResponse response = GreetingResponse.newBuilder()
            .setId(1)
            .setGreeting("hello")
            .build();

        when(helloServiceBlockingStub.getGreeting(request))
            .thenReturn(response);

        HelloDto result = serviceBase.getGreeting(1);

        assertEquals(1,result.getId());
        assertEquals("hello",result.getValue());
    }

    @Test
    public void updateGreeting_successFlow() {
        UpdateGreetingRequest request = UpdateGreetingRequest.newBuilder()
            .setGreeting("hello")
            .setId(1)
            .build();
        GreetingResponse response = GreetingResponse.newBuilder()
            .setId(1)
            .setGreeting("hello")
            .build();

        when(helloServiceBlockingStub.updateGreeting(request))
            .thenReturn(response);

        HelloDto result = serviceBase.updateGreeting(1,"hello");

        assertEquals(1,result.getId());
        assertEquals("hello",result.getValue());
    }

    @Test
    public void deleteGreeting_successFlow() {
        DeleteGreetingRequest request = DeleteGreetingRequest.newBuilder()
            .setId(1)
            .build();
        DeleteGreetingResponse response = DeleteGreetingResponse
            .getDefaultInstance();

        when(helloServiceBlockingStub.deleteGreeting(request))
            .thenReturn(response);

        serviceBase.deleteGreeting(1);

        verify(helloServiceBlockingStub).deleteGreeting(request);
    }
}
