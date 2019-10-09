package com.cn.stardust;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

/**
 * https://github.com/oraclexing
 * <p>
 *
 * @author stardust
 * @version 1.0.0
 * 2019/10/9  10:10
 */
@Configuration
@EnableAutoConfiguration
@EnableAdminServer
@SpringBootApplication
public class AdminActuatorApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdminActuatorApplication.class,args);
    }
}