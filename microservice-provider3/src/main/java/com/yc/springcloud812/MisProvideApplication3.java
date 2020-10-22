package com.yc.springcloud812;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient //启动服务端 发现客户端信息以获取当前provider的注册信息
public class MisProvideApplication3 {

	public static void main(String[] args) {
		SpringApplication.run(MisProvideApplication3.class, args);
	}

}
