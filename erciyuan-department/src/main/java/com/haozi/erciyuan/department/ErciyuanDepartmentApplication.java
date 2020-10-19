package com.haozi.erciyuan.department;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 *
 * @author terry
 * @date Created in 2020/10/19 12:26
 * @description TODO
 * @version 1.0
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ErciyuanDepartmentApplication {

    public static void main(String[] args) {
        SpringApplication.run(ErciyuanDepartmentApplication.class, args);
    }

}
