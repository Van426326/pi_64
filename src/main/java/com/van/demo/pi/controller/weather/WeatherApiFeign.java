package com.van.demo.pi.controller.weather;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "weather-api", url = "https://www.tianqiapi.com/api/")
public interface WeatherApiFeign {

    @GetMapping
    String getWeatherJson(@RequestParam String version,
                                   @RequestParam String cityid,
                                   @RequestParam String city,
                                   @RequestParam String appid,
                                   @RequestParam String appsecret);



}
