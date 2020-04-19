package com.lixuecheng.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import java.applet.AppletContext;


@SpringBootApplication
@EnableEurekaClient
public class ClientApplication {

    public static void main(String[] args) {

        SpringApplication.run(ClientApplication.class,args);

    }


}
