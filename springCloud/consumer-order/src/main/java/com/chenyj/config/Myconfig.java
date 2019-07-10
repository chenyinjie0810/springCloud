package com.chenyj.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RetryRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author chenyj
 * @Description
 * @Date create by 2019/6/16 22:22
 * 陈银杰专属测试
 */
@Configuration
public class Myconfig {

    /**
     * @desc: 开启微服务远程调用
     * @author: chenyj
     * @date: 2019/7/10
     * @return
     */
    @LoadBalanced //开启负载均衡
    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

    /**
     * @desc: 定义负载均衡
     * @author: chenyj
     * @date: 2019/7/10
     * @return
     */
   /* @Bean
    public IRule myIRule(){
//        return new RetryRule();
        return new RandomRule();
    }*/

}
