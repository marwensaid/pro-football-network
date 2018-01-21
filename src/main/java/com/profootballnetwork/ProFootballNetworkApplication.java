package com.profootballnetwork;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties

public class ProFootballNetworkApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProFootballNetworkApplication.class, args);
    }
}
