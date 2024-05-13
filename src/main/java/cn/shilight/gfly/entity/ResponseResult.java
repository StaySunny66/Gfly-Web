package cn.shilight.gfly.entity;


import java.util.Date;

// 响应实体类
public class ResponseResult {

    private int code;

    private String date;

    private Object obj;

    public ResponseResult() {
    }

    public ResponseResult(int code, Object obj) {
        this.code = code;
        this.date = (new Date()).toString();
        this.obj = obj;
    }

    public static ResponseResult ok(Object o){

        ResponseResult responseResult = new ResponseResult(200,o);
        return responseResult;

    }

}
