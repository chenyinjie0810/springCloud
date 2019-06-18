package com.chenyj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * Hello world!
 *
 */
@SpringBootApplication
//@RibbonClient(name = "PROVIDER-USER")
public class ConsumerOrderApplication
{
    public static void main( String[] args )
    {
        SpringApplication.run(ConsumerOrderApplication.class, args);
    }
}
