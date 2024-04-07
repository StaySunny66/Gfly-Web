package cn.shilight.gfly.entity;


import java.util.Calendar;
import java.util.Date;
import java.util.Objects;

// 响应实体类
public class ResponseEntity {

    private int code;

    private String date;

    private Object obj;

    public ResponseEntity() {
    }

    public ResponseEntity(int code, Object obj) {
        this.code = code;
        this.date = (new Date()).toString();
        this.obj = obj;
    }

    public static ResponseEntity ok(Object o){

        ResponseEntity responseEntity = new ResponseEntity(200,o);
        return responseEntity;

    }

}
