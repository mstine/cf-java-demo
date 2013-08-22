package com.mattstine.cfdemo.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @RequestMapping("/")
    public String helloWorld(Model model) {
        model.addAttribute("message", "Hello World!");
        return "index";
    }

}
