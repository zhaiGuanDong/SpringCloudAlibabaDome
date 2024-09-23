package com.example.springboota;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringBootAApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootAApplication.class, args);
    }

}
