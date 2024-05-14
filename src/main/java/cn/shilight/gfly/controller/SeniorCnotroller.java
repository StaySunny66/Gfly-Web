package cn.shilight.gfly.controller;

import cn.shilight.gfly.entity.ApiResponse;
import cn.shilight.gfly.entity.Senior;
import cn.shilight.gfly.mapper.SeniorMapper;
import cn.shilight.gfly.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SeniorCnotroller {


    @Autowired
    private SeniorMapper seniorMapper;


    @PostMapping("/api/newSenior")
    public ApiResponse insertSenior(){
        ApiResponse apiResponse = new ApiResponse(200,"ok",null);

        Senior senior = new Senior(0,"测试",true,false,true,"huodd");

        if(seniorMapper.insertSenior(senior)==1){

            apiResponse.setMessage("finish");

        }else {

            apiResponse.setMessage("Err");
            apiResponse.setStatus(300);


        }


        return apiResponse;
    }


}
