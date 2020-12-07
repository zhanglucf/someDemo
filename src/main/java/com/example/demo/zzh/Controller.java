package com.example.demo.zzh;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: ZhangZhenhua
 * @Date: 2020/9/8 10:06
 */
@RestController
public class Controller {

    @Value("${zzh}")
    private String zzh;

    @GetMapping
    public String print(){
       return zzh;
    }}
