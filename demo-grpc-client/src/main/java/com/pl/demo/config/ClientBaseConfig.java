package com.pl.demo.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Data
@Configuration
@ConfigurationProperties(prefix = "demo.grpc")
@PropertySource("classpath:grpc_client_app.properties")
public class ClientBaseConfig {

    private String host;
    private Integer port;
}
