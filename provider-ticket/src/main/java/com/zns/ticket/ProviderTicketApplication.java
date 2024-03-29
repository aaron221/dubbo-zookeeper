package com.zns.ticket;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/*
*
 * 1、将服务提供者注册到注册中心
 *      1、引入dubbo和zkclient依赖
 *      2、配置dubbo的扫描包和注册中心地址
 *      3、使用@Service发布服务
 * @创建日期 12:11 2019/2/28
 **/
@EnableDubbo //开启dubbo服务
@SpringBootApplication
public class ProviderTicketApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderTicketApplication.class, args);
    }

}
