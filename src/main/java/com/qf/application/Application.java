package com.qf.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author ChenJie
 * @date 2020-05-25 21:15:02
 * 功能说明
 */
@SpringBootApplication(scanBasePackages = "com.qf.appication")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
