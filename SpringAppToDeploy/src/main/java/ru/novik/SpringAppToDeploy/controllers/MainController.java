package ru.novik.SpringAppToDeploy.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    String parameter = "World";

    @GetMapping("/")
    public String greeting(Model model) {
        model.addAttribute("parameter", parameter);
        return "home";
    }

}
