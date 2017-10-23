package com.qingao.controllers;

import com.qingao.services.HiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by qingao on 17-10-23.
 */

@RestController
public class HiController {

    @Autowired
    private HiService hiService;

    @RequestMapping("/hi")
    public String hi(@RequestParam("name") String name) {
        return hiService.sayHi(name);
    }
}
