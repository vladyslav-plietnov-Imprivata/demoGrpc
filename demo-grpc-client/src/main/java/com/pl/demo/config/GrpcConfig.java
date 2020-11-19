package com.pl.demo.config;

import static com.pl.demo.grpc.HelloServiceGrpc.HelloServiceBlockingStub;

import com.pl.demo.grpc.HelloServiceGrpc;
import io.github.resilience4j.circuitbreaker.CircuitBreaker;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GrpcConfig {

    @Bean
    public ManagedChannel managedChannel(ClientBaseConfig clientBaseConfig) {
        return ManagedChannelBuilder.forAddress(clientBaseConfig.getHost(), clientBaseConfig.getPort())
            .usePlaintext()
            .build();
    }

    @Bean
    public HelloServiceBlockingStub helloServiceBlockingStub(ManagedChannel managedChannel) {
        return HelloServiceGrpc.newBlockingStub(managedChannel);
    }

    @Bean
    public CircuitBreaker circuitBreaker() {
        return CircuitBreaker.ofDefaults("hello-service");
    }
}
