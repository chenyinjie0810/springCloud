package com.chenyj;

import com.chenyinjie.MyRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@RibbonClient(name = "PROVIDER-USER",configuration= MyRule.class)
public class ConsumerOrderApplication
{
    public static void main( String[] args )
    {
        SpringApplication.run(ConsumerOrderApplication.class, args);
    }
}
