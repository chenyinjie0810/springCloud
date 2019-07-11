package com.chenyj.controller;

import com.chenyj.pojo.Dept;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author chenyj
 * @Description
 * @Date create by 2019/6/16 21:48
 * 陈银杰专属测试
 */
@RestController
public class DeptController {
    private final Logger logger= LoggerFactory.getLogger(this.getClass());

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/dept/getDept/{id}")
    public String getDept(@PathVariable("id") Long id){
        System.out.println("当前端口：8001");
        Dept dept=new Dept(id,"陈银杰","cloud8001");
        return dept.toString();
    }

    @GetMapping("/dept/discovery")
    public Object discovery(){
        List<String> stringList=discoveryClient.getServices();
        logger.info("stringList===》"+stringList);
        List<ServiceInstance> list= discoveryClient.getInstances("provider-user");
        for (ServiceInstance value:list){
            logger.info(value.getServiceId()+"\t"+value.getHost()+"\t"+value.getPort()+"\t"+value.getUri());
        }
        return this.discoveryClient;
    }
}
