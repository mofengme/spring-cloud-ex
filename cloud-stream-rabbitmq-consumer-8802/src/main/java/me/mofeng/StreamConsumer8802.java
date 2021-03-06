package me.mofeng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author mofeng
 * @date 2021/9/23 16:25
 */
@SpringBootApplication
@EnableEurekaClient
public class StreamConsumer8802 {
    public static void main(String[] args) {
        SpringApplication.run(StreamConsumer8802.class, args);
    }
}
