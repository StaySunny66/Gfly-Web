package cn.shilight.gfly.controller;

import cn.shilight.gfly.entity.Plane;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FlyController {


    @PostMapping ("/api/plane/get")
    @ResponseBody
    public ResponseEntity getPlaneByUser(String username,String pass){

       // Plane plane = new Plane("Gf0001","gxyos");
        return ResponseEntity.ok(0);

    }





    @GetMapping ("/api/plane/get")
    @CrossOrigin(origins = "http://localhost:5173")
    @ResponseBody
    public ResponseEntity getPlaneByUsers(String username){

        Plane plane = new Plane(username,"gxyos","dsd",12,1.2f);
        return ResponseEntity.ok(plane);


    }








}
