//package com.chenyj.config;
//
//import com.netflix.client.config.IClientConfig;
//import com.netflix.loadbalancer.IRule;
//import com.netflix.loadbalancer.RandomRule;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
///**
// * @Author chenyj
// * @Description
// * @Date create by 2019/6/18 23:31
// * 陈银杰专属测试
// */
//@Configuration
//public class LoadBalancedConfig {
//
//    @Autowired
//    private IClientConfig clientConfig;
//
//    @Bean
//    public IRule rule(IClientConfig config){
//        return new RandomRule();
//    }
//}
