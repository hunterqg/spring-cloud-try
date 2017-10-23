package com.qingao.services;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by qingao on 17-10-23.
 */
@Service
public class HiService {
    public static final String URL = "http://SERVICE-HI/hi?name=";
    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hiError")
    public String sayHi(String name) {
        return restTemplate.getForObject(URL+name,String.class);
    }

    public String hiError(String name) {
        return String.format("Hi %s, sorry , error occoured.",name);
    }
}
