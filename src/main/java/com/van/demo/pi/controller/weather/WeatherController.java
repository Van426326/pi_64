package com.van.demo.pi.controller.weather;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("weather")
public class WeatherController {

    @Autowired
    private WeatherApiFeign weatherApiFeign;

    @GetMapping("real")
    public Object getWeatherJson() {
        return weatherApiFeign.getWeatherJson("v1","101190113","南京","62551447","I3cd2siv");
    }
}
