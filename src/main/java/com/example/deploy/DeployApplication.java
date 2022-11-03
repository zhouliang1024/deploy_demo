package com.example.deploy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan(value = {"com.example.deploy.dao"})
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class DeployApplication {

    public static void main(String[] args) {
        SpringApplication.run(DeployApplication.class, args);
    }

}
