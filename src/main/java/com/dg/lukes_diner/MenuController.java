package com.dg.lukes_diner;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MenuController {

    @GetMapping("/menu")
    public String showMenuPage() {
        return "menu"; // Assuming your Thymeleaf template is named "menu.html"
    }
}
