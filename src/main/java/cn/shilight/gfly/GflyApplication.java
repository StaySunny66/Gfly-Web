package cn.shilight.gfly;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan(basePackages = {"cn.shilight.gfly.mapper"})
public class GflyApplication {

    public static void main(String[] args) {
        SpringApplication.run(GflyApplication.class, args);
    }

}
