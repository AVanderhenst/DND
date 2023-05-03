package com.spring.dnd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import static java.lang.Integer.parseInt;

@Controller
public class IndexController {
    @GetMapping("/home")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model, @RequestParam(name="age", required=false, defaultValue="30") String age) {
        System.out.println("Controller says hello");
        model.addAttribute("name", name);
        model.addAttribute("age", parseInt(age));
        return "home";
    }


}
