package com.itmuch.cloud.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * git上手动更改配置文件，
 *  curl -X POST http://localhost:8080/bus/refresh
 *  注：下面二个只能单机使用，不能通过mq刷新
 * curl -X POST http://localhost:8080/actuator/refresh 用来测试刷新配置更改，
 * 引入Cloud Bus后，就会多一个/actuator/bus-refresh 端点
 *
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigServerApplication {
  public static void main(String[] args) {
    SpringApplication.run(ConfigServerApplication.class, args);
  }
}
