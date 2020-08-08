package com.example.demo;

import com.example.demo.service.demolalaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoServiceRest {

    @Autowired
    demolalaServiceImpl demolalaService;

    @GetMapping("/calculate")
    public Integer hello() {
        Integer lala = demolalaService.getTwoOf();
        return lala;
    }
}
