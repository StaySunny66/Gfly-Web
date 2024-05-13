package cn.shilight.gfly.controller;

import cn.shilight.gfly.entity.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@RestController
public class WeatherController {

    // 2024.5.13 对接彩云天气API 实现经纬度查询 当地天气
    // 接口编写完成

    // 待添加鉴权

@PostMapping("/api/weather/get")
@CrossOrigin(origins = "http://localhost:5173")
@ResponseBody
public Mono<String> Weather_Get(String JD, String WD){
    WebClient webClient =  WebClient.create();

    String apiUrl = "https://api.caiyunapp.com/v2.6/uHFavg4lxfkMV7Ar/"+JD+","+WD+"/realtime";
    return webClient.get()
                .uri(apiUrl)
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToMono(String.class);




}




}
