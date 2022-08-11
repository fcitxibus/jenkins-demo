package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA
 * Description：hello
 * Author：Mr.LemonX
 * Create：22/8/4 12:25
 * Company: Geek Studio
 */
@RestController
public class HelloController {

    @Autowired
    StringRedisTemplate redisTemplate;

    @GetMapping("/hello")
    public String hello(){
        Long views = redisTemplate.opsForValue().increment("views");
        return "hello,My linux,haha,views:" + views;
    }

}
