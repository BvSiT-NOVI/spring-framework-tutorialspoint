package com.tutorialspoint;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.ModelMap;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
@RequestMapping("/hello")
public class HelloController {
    @RequestMapping(method = RequestMethod.GET)public String printHello(ModelMap model) {
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        String message = "Spring MVC Framework. The current time: "+ formatter.format(new Date());
        model.addAttribute("message", message);
        return "hello";
    }
}