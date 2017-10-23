package com.qingao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

/**
 * Created by qingao on 17-10-23.
 */
@SpringBootApplication
@EnableEurekaClient
@EnableHystrix
@ComponentScan("com.qingao")
public class RibbonServerApp {

    public static void main(String [] args) {
        SpringApplication.run(RibbonServerApp.class,args);
    }

    @Bean
    @LoadBalanced
    RestTemplate restTemplate() {
        return  new RestTemplate();
    }
}
