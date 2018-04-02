package com.example.demo;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Zhangk
 * @Date 20:55 2018/3/29
 * @Description
 */
@RestController
@EnableAutoConfiguration
public class DemoController {
    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }

}
