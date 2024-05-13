package cn.shilight.gfly.controller;
import cn.shilight.gfly.util.JwtTokenUtil;
import org.apache.el.parser.Token;
import org.apache.ibatis.jdbc.Null;
import org.springframework.http.ResponseEntity;
import cn.shilight.gfly.entity.ApiResponse;
import cn.shilight.gfly.entity.ResponseResult;
import cn.shilight.gfly.entity.User;
import cn.shilight.gfly.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class LoginController {

    @Autowired
    private  UserMapper userMapper;

    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @PostMapping("/api/login")
    @CrossOrigin(origins = "http://localhost:5173")
    @ResponseBody
    public ResponseEntity Login(String username,String pass) {
        // 登录校验

        User user = userMapper.getUserByUserName(username);
        System.out.println(user.getPassword());

        ApiResponse apiResponse = new ApiResponse(200,"ok", null);
        if (user != null) {

            if (user.getPassword().equals(pass)) {

                String token = jwtTokenUtil.generateToken(username);
                apiResponse.setData(token);
                return ResponseEntity.ok(apiResponse);

            } else {
                apiResponse.setStatus(300);
                return ResponseEntity.ok(apiResponse);
            }

        }
        apiResponse.setStatus(300);
        return ResponseEntity.ok(apiResponse);

    }




    //Token 检查函数
    @PostMapping("/api/loginCheck")
    @CrossOrigin(origins = "http://localhost:5173")
    @ResponseBody
    public ResponseEntity LoginCheck(String Token){
        ApiResponse apiResponse = new ApiResponse(200,"ok", null);
        if(Token == null){

            apiResponse.setStatus(300);
            return ResponseEntity.ok(apiResponse);

        }

        if(JwtTokenUtil.validateToken(Token)){

            return ResponseEntity.ok(apiResponse);
        }else {

            apiResponse.setStatus(300);
            return ResponseEntity.ok(apiResponse);

        }





    }






    // 处理基本的GET请求
    @GetMapping("/api/hello")
    @ResponseBody
    public String hello() {
        return "Hello, World!";
    }

    // 处理基本的GET请求
    @GetMapping("/api/test")
    @ResponseBody
    public String test() {
        int row = userMapper.insertUser(new User("123","gxyos","7788521","高旭阳"));
        if(row == 1){
            return "ok";
        }else {

            return "Err";

        }



    }

    // 处理带参数的GET请求
    @GetMapping("/api/greet")
    @ResponseBody
    public String greet(@RequestParam(name = "name", defaultValue = "Guest") String name) {
        return "Hello, " + name + "!";
    }

    // 处理带多个参数的GET请求
    @GetMapping("/api/details")
    @ResponseBody
    public String userDetails(
            @RequestParam(name = "username") String username,
            @RequestParam(name = "age") int age) {
        return "Username: " + username + ", Age: " + age;
    }


    @GetMapping("/api/Rtest")
    @ResponseBody
    public  ResponseEntity RespondTest(){

        ApiResponse response = new ApiResponse(200, "Success",
                new User("name","sss","sssssss","sdasdas"));
        return ResponseEntity.ok(response);


    }


}
