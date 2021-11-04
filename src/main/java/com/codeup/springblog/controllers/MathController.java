package com.codeup.springblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MathController {

    @GetMapping("/add/{num1}/plus/{num2}")
    @ResponseBody
    public String returnAddition(@PathVariable int num1, @PathVariable int num2) {
        return "The sum of " + num1 + " and " + num2 + " is " + (num1+num2) + ".";
    }

    @GetMapping("/sub/{num1}/from/{num2}")
    @ResponseBody
    public String returnSubtraction(@PathVariable int num1, @PathVariable int num2) {
        return "The difference from " + num1 + " and " + num2 + " is " +(num1-num2) + ".";
    }

    @GetMapping("/mult/{num1}/and/{num2}")
    @ResponseBody
    public String returnMultiplication(@PathVariable int num1, @PathVariable int num2) {
        return num1 + " and " + num2 + " multiplied is " +(num1*num2) + ".";
    }

    @GetMapping("/div/{num1}/by/{num2}")
    @ResponseBody
    public String returnDivision(@PathVariable int num1, @PathVariable int num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Cannot divide by 0.");
        }
        return num1 + " is divided from " + num2 + " , " + (num1-num2) + " times.";
    }

}
