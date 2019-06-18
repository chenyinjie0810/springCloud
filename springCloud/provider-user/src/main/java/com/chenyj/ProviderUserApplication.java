package com.chenyj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableEurekaClient
public class ProviderUserApplication {
    public static void main( String[] args ) {
        SpringApplication.run(ProviderUserApplication.class,args);
    }
}
