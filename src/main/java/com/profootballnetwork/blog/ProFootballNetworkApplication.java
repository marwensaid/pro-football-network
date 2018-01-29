package com.profootballnetwork.blog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * @author msaidi
 */
@SpringBootApplication
@EnableConfigurationProperties
public class ProFootballNetworkApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProFootballNetworkApplication.class, args);
    }
}

