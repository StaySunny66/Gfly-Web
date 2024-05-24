package cn.shilight.gfly.controller;

import cn.shilight.gfly.entity.*;
import cn.shilight.gfly.mapper.ValueDataMapper;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;
import java.util.LinkedList;
import java.util.List;

@RestController
public class ValueDataController {

    @Autowired
    private ValueDataMapper valueDataMapper;



    @PostMapping("api/getMapData")
    @CrossOrigin(origins = "http://localhost:5173")

    public ApiResponse getMapData(String id,long time,int x){
        ApiResponse apiResponse = new ApiResponse(200,"ok",null);

        List<ValueData> valueData= valueDataMapper.getValueData(id);
        if(!valueData.isEmpty()){
            List<DataFeature> features = new LinkedList<>();
            for(int i = 0;i<valueData.size();i++){
                features.add(new DataFeature(Double.parseDouble(valueData.get(i).getJD()),
                        Double.parseDouble(valueData.get(i).getWD()),
                        (int) (valueData.get(i).getValueData() * x)));
            }
            MapData mapData = new MapData(features);
            apiResponse.setData(mapData);
        }else {
            apiResponse.setStatus(300);
            apiResponse.setMessage("err");
        }

        return apiResponse;

    }

    @PostMapping("/api/seniorUpload")
    @CrossOrigin(origins = "http://localhost:5173")

    public ApiResponse seniorUpload(int seniorId, String valueName, String JD, String WD, long sampleTime, double valueData, String valueUnits){
        ApiResponse apiResponse = new ApiResponse(200,"ok",null);

        //System.out.println("dddd" + valueName);

        ValueData value = new ValueData(
                seniorId,
                valueName,
                JD,
                WD,
                sampleTime,
                valueData,
                valueUnits

            );

        int result =  valueDataMapper.insertSeniorData(value);

        if(result!=1){

            apiResponse.setMessage("err");
            apiResponse.setStatus(300);


        }


        return apiResponse;

    }


}
