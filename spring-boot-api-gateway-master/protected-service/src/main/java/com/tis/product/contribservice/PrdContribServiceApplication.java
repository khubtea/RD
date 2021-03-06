package com.tis.product.contribservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class PrdContribServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(PrdContribServiceApplication.class, args);
    }

}
