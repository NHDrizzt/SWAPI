package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class SpringController {

    @RequestMapping(value = "/user")
    public String consumeAPI() {
        return "Test";
    }

    @GetMapping(value = "/calltest")
    public String getTesString() {
        String uri = "https://swapi.dev/api/planets/3/";
        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(uri, String.class);
        return result;
    }

}
