package cn.shilight.gfly.controller;

import cn.shilight.gfly.entity.User;
import cn.shilight.gfly.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {

    @Autowired
    private  UserMapper userMapper;

    @PostMapping("/login")
    @ResponseBody
    public String Login(String username,String pass){
        // 登录校验
        User user = userMapper.getUserByUserName(username);
        if (user == null){
            return "no user";
        }
        if(user.getPassword().equals(pass)){
            return "ok";

        }else {

            return "err";
        }

    }
    // 处理基本的GET请求
    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        return "Hello, World!";
    }

    // 处理基本的GET请求
    @GetMapping("/test")
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
    @GetMapping("/greet")
    @ResponseBody
    public String greet(@RequestParam(name = "name", defaultValue = "Guest") String name) {
        return "Hello, " + name + "!";
    }

    // 处理带多个参数的GET请求
    @GetMapping("/details")
    @ResponseBody
    public String userDetails(
            @RequestParam(name = "username") String username,
            @RequestParam(name = "age") int age) {
        return "Username: " + username + ", Age: " + age;
    }
}
