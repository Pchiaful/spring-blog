package com.codeup.springblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class AdController {

    @GetMapping("/ads")
    @ResponseBody
    public String showAds() {
        return "Showing all the ads";
    }

    @GetMapping("/ads/{id}")
    @ResponseBody
    public String showSingleAd(@PathVariable long id) {
        return "Showing ad:" + id;
    }

    @PostMapping("/ads")
    @ResponseBody
    public String createAd() {
        return "creating an ad";
    }

    @GetMapping("/color/{color}")
    @ResponseBody
    public String returnColor(@PathVariable String color){
        return "<h1 style='color:" + color + "'>" + color + "</h1>";
    }

    @GetMapping("/bg/{color1}/font/{color2}")
    @ResponseBody
    public String returnBgFontColor(@PathVariable String color1, @PathVariable String color2) {
        return String.format("<h1 style='background-color:%s;color:%s'>THIS IS THE FONT</h1>", color1, color2);
    }

    @GetMapping("/name")
    @ResponseBody
    public String returnName(@RequestParam(defaultValue = "Hello World") String n) {
        return "Returning name: " + n;
    }
}
