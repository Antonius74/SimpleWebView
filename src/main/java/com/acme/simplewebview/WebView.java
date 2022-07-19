package com.acme.simplewebview;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class WebView {
    @GetMapping("/")
    public String home() {
        return "home";
    }
}
