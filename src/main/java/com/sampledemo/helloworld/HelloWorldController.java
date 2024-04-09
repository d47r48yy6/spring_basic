package com.sampledemo.helloworld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RequestMapping
    public String helloWorld (){
        return "Hello World From Spring Boot";
    }
    @RequestMapping("/goodbye")
    public String goodbye()
    {
        return "goodbye from the Spring boot";
    }




}
