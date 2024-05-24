package cn.shilight.gfly.controller;

import cn.shilight.gfly.entity.ApiResponse;
import cn.shilight.gfly.entity.Senior;
import cn.shilight.gfly.entity.ValueData;
import cn.shilight.gfly.mapper.SeniorMapper;
import cn.shilight.gfly.mapper.UserMapper;
import cn.shilight.gfly.mapper.ValueDataMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class SeniorCnotroller {


    @Autowired
    private SeniorMapper seniorMapper;
    @Autowired
    private ValueDataMapper valueDataMapper;



    @GetMapping("/api/getSeniors")
    @CrossOrigin(origins = "http://localhost:5173")
    public ApiResponse getSeniors(){
        ApiResponse apiResponse = new ApiResponse(200,"ok",null);
        apiResponse.setData(seniorMapper.getAllSeniors());

        return apiResponse;

    }


    
    @GetMapping("/api/getMapSeniors")
    @CrossOrigin(origins = "http://localhost:5173")
    public  ApiResponse getMapSeniors(){

        ApiResponse apiResponse = new ApiResponse(200,"ok",null);

        apiResponse.setData(seniorMapper.getMapSeniors());

        return apiResponse;




    }





    @PostMapping("/api/deleteSenior")
    @CrossOrigin(origins = "http://localhost:5173")
    public ApiResponse deleteSeniorById(int id){

        System.out.println("id" + id);
        ApiResponse apiResponse = new ApiResponse(200,"ok",null);
        if(seniorMapper.deleteUser(id)!=1){

            apiResponse.setStatus(300);
            apiResponse.setMessage("err");

        }
            return apiResponse;


    }

    @PostMapping("/api/newSenior")
    @CrossOrigin(origins = "http://localhost:5173")
    public ApiResponse insertSenior(String name,boolean SeniorMapEn,boolean SeniorViewEn,boolean AutoEn,String Others){
        ApiResponse apiResponse = new ApiResponse(200,"ok",null);
        System.out.println("name " + name);

        if(name.length()<2){
            apiResponse.setStatus(300);
            return apiResponse;


        }
        Senior senior = new Senior(0,name,SeniorMapEn,SeniorViewEn,AutoEn,Others);

        if(seniorMapper.insertSenior(senior)==1){

            apiResponse.setMessage("finish");

        }else {

            apiResponse.setMessage("Err");
            apiResponse.setStatus(300);


        }


        return apiResponse;
    }


    // 获取所有可以显示在首页的传感器最新数据
    @GetMapping("/api/getSeniorNew")
    @CrossOrigin(origins = "http://localhost:5173")
    public ApiResponse getSeniorNew(){
        ApiResponse apiResponse = new ApiResponse(200,"ok",null);

        // 获取所有可以在界面显示的数据
        List<Senior> seniors = seniorMapper.getViewSeniors();
        List<ValueData> valueDatas = new ArrayList<ValueData>();

        if(seniors==null){

            apiResponse.setStatus(201);
            // 没有传感器显示数据
        }else {

            if(seniors.isEmpty()){
                apiResponse.setStatus(202);
                return apiResponse;


            }

            for(int i=0;i<seniors.size();i++){

                System.out.println(i);

                ValueData valueData =  valueDataMapper.getOneValueData(seniors.get(i).getSeniorId());
                if(valueData!=null){
                    valueDatas.add(valueData);
                }
            }
            apiResponse.setData(valueDatas);

        }



        return apiResponse;
    }





}
