package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloControllers {

//    handles requests at path /hello

    @GetMapping("hello")
    @ResponseBody
    public String hello(){
        return "Hello, Spring!";
    }

    @GetMapping("goodbye")
    @ResponseBody
    public String goodBye(){
        return "Goodbye, Spring!";
    }

}
