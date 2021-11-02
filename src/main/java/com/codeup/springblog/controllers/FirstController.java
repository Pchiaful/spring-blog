package com.codeup.springblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FirstController {

    @GetMapping("/hello") //url to
    @ResponseBody
    public String returnHello() {
        return "Hello World";
    }

    @GetMapping("/hallo")
    @ResponseBody
    public String returnHallo() {
        return "<h1>Hallo bois</h1>";
    }



}
