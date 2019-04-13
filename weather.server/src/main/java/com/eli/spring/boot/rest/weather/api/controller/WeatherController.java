package com.eli.spring.boot.rest.weather.api.controller;

import com.eli.spring.boot.rest.weather.api.dto.HomeResponse;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class WeatherController {
/*
    @GetMapping("/")
    public HomeResponse index() {
        return new HomeResponse("/");
    }

    @GetMapping("/home")
    public HomeResponse home() {
        return new HomeResponse("/home");
    }
*/
    @GetMapping("/about")
    public HomeResponse about() {
        return new HomeResponse("/about");
    }


}
