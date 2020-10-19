package com.haozi.erciyuan.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * ecjob网关启动类
 * @author terry
 * @date Created in 2020/10/16 10:34
 * @version 1.0
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ErciyuanGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(ErciyuanGatewayApplication.class, args);
    }

}
