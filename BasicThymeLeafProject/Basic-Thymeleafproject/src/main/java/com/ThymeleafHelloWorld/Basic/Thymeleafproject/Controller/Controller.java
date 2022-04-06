package com.ThymeleafHelloWorld.Basic.Thymeleafproject.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.stereotype.Controller
public class Controller {
    @GetMapping({"/","/hello"})
    public String hello(@RequestParam(value="name",defaultValue = "world",
            required = true)String  name, Model model)
    {
        model.addAttribute("name",name);
        return "hello";
    }
}
