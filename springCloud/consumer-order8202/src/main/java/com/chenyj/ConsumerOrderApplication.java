package com.chenyj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableFeignClients(basePackages= {"com.chenyj"})
@ComponentScan("com.chenyj")
public class ConsumerOrderApplication
{
    public static void main( String[] args )
    {
        SpringApplication.run(ConsumerOrderApplication.class, args);
    }
}
