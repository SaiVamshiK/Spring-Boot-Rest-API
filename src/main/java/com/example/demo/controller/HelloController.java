package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
//    @RequestMapping(value={"/"},method = RequestMethod.GET)
    @GetMapping(value = "/")
    public String getHelloPage(){
        return "Hello Page";
    }
}
