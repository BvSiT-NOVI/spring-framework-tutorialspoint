package com.tutorialspoint;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

//  localhost:8080/api/test
@Controller
@RequestMapping("/api")
public class TestController {
    @GetMapping(value = "/test")
    public String test() {
        return "test";
    }
}
