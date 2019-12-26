package com.van.demo.pi.controller.weather;

import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("weather")
@Log4j
public class WeatherController {

    @Autowired
    private WeatherApiFeign weatherApiFeign;

    @GetMapping("real")
    public Object getWeatherJson() {
        String json = weatherApiFeign.getWeatherJson("v1","101190113","南京","62551447","I3cd2siv");
        return json;
    }
}
