package com.mattstine.cfdemo.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class HelloController {

    @RequestMapping("/")
    public String helloWorld(Model model, HttpSession session) {
        String message = (String) session.getAttribute("message");
        String port = System.getenv("PORT");
        model.addAttribute("port", port);

        if (message != null) {
            model.addAttribute("message", message);
        }

        return "index";
    }

    @RequestMapping("/addMessageToSession")
    public String addMessageToSession(HttpSession session) {
        session.setAttribute("message", "Hello from your HttpSession!");
        return "redirect:/";
    }

}
