package com.evoke;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    private String name;
    @Autowired
    private Environment environment;


    @GetMapping(path = "welcome")
    public String welcome() {
        return "welcome to springboot"+environment.getProperty("test");
    }
}
