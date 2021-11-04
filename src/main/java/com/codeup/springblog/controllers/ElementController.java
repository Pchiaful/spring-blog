package com.codeup.springblog.controllers;

import com.codeup.springblog.models.Element;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ElementController {

    @GetMapping("/elements")
    public String elementInfo() {
        return "views-lecture/elements";
    }

    @GetMapping("/elements/{element}")
    public String elementSelection(@PathVariable String element, Model model) {
        Element attune = new Element();
        Element attune2 = new Element();
        attune.setAttunement(element);
        if (element.equals("air")) {
            attune.setAttunement("Freedom");
            attune2.setAttunement("Speed");
        }else if (element.equals("water")) {
            attune.setAttunement("Flexibility");
            attune2.setAttunement("Turbulent");
        }else if (element.equals("earth")) {
            attune.setAttunement("Longevity");
            attune2.setAttunement("Immovable");
        }else {
            attune.setAttunement("Vibrancy");
            attune2.setAttunement("Duality");
        }
        List<Element> attunements = new ArrayList<>();
        attunements.add(attune);
        attunements.add(attune2);
        model.addAttribute("attunements", attunements);
        model.addAttribute("attune", attune);
        return "views-lecture/elements";
    }



}
