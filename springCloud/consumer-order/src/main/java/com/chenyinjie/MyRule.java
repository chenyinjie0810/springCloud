package com.chenyinjie;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author chenyj
 * @Description
 * @Date create by 2019/7/10 22:02
 * 陈银杰专属测试
 */
@Configuration
public class MyRule {

    @Bean
    public IRule rule(){
        return new RandomRule_ZY();
    }
}
