package com.van.demo.pi.controller.weather;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "weather-api", url = "https://www.tianqiapi.com/api/")
public interface WeatherApiFeign {

    @GetMapping
    String getWeatherJson(@RequestParam(value = "version") String version,
                           @RequestParam(value = "cityid") String cityId,
                           @RequestParam(value = "city") String city,
                           @RequestParam(value = "appid") String appId,
                           @RequestParam(value = "appsecret") String appSecret);



}
