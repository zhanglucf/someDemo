package com.example.demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: ZhangZhenhua
 * @Date: 2020/9/27 10:45
 */
@RequestMapping("/test")
@RestController
public class TController {

    @PostMapping
    public String f(){
        return "hi";
    }
}
