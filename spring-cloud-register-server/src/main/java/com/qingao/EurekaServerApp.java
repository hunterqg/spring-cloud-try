package com.qingao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by qingao on 17-10-19.
 */

@EnableEurekaServer
@SpringBootApplication
public class EurekaServerApp {
    public static void main(String [] args) {
        SpringApplication.run(EurekaServerApp.class,args);
    }
}
