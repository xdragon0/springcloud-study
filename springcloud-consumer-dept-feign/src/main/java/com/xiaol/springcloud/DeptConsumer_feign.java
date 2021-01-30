package com.xiaol.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.xiaol.springcloud"})
@ComponentScan("com.xiaol.springcloud")
public class DeptConsumer_feign {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer_feign.class,args);
    }
}
