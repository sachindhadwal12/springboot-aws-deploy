package com.stackroute.springbootawsdeploy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class TestController {

    @GetMapping("/data")
    public String getData(){
        return "First Message from AWS ECS";
    }
    @GetMapping("hello")
    public String getHello(){
        return "AWS CI/CD pipeline";
    }
}
