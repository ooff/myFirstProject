package com.kfit.jsp.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * 测试
 * @version v.0.1
 */
@RestController
public class HelloController {

    // 从 application.properties 中读取配置，如取不到默认值为Hello Shanhy
    @Value("${application.hello:Hello Angel}")
    private String hello;

       @RequestMapping("/helloJsp")
       public String helloJsp(Map<String,Object> map){
    	   
              System.out.println("HelloController.helloJsp().hello="+hello);
              
              map.put("hello", hello);
              
              return "helloJsp";
       }
}
