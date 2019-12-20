package com.mattyang.baconhamtodo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = {"com.mattyang.baconhamtodo.dao"})
public class BaconhamtodoApplication {

    public static void main(String[] args) {
        SpringApplication.run(BaconhamtodoApplication.class, args);
    }

}
