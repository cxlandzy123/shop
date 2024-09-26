package com.cxl;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@MapperScan("com.cxl.mapper")
@EnableFeignClients
@EnableCaching
@EnableTransactionManagement
public class AdminApp {
    public static void main(String[] args) {
        SpringApplication.run(AdminApp.class);
    }

}
