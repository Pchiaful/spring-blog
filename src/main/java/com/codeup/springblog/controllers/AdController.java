package com.codeup.springblog.controllers;

import com.codeup.springblog.models.Ad;
import com.codeup.springblog.repositories.AdRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class AdController {

    private final AdRepository adRepository;

    public AdController(AdRepository adRepository) {
        this.adRepository = adRepository;
    }

//    @GetMapping("/ads")
//    @ResponseBody
//    public String showAds() {
//        System.out.println(adRepository.findAll());
//        return "hi";
//    }

    @GetMapping("/ads/{id}")
    @ResponseBody
    public String showSingleAd(@PathVariable long id) {
        return "Showing ad:" + id;
    }

//    @GetMapping("/ads/{title}")
//    @ResponseBody
//    public Ad getByTitle(@PathVariable String title) {
//        return adRepository.findByTitle(title);
//    }

    @GetMapping("/ads/{titlePart}")
    @ResponseBody
    public List<Ad> getByTitle(@PathVariable String titlePart) {
        return adRepository.findByTitleLike(titlePart);
    }

//    @PostMapping("/ads")
//    @ResponseBody
//    public String createAd(@ResponseBody Ad newAd) {
//        adRepository.save(newAd);
//        return String.format("Ad created with an ID of %s", newAd.getId());
//    }

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
