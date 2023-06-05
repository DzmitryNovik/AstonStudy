package ru.novik.SpringAppForSecondHomework.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    String parameter = "World Wide Web";

    @GetMapping("/")
    public String greeting(Model model) {
        model.addAttribute("parameter", parameter);
        return "home";
    }

}
