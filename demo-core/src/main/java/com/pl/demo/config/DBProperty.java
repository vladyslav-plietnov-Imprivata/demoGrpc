package com.pl.demo.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Data
@Configuration
@ConfigurationProperties(prefix = "spring.database")
@PropertySource("classpath:app.properties")
public class DBProperty {

    private String server;
    private Integer port;
    private String db;
    private String username;
    private String password;
    private String schema;
}
