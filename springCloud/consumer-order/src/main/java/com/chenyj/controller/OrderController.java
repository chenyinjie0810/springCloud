package com.chenyj.controller;

import com.chenyj.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author chenyj
 * @Description
 * @Date create by 2019/6/16 22:06
 * 陈银杰专属测试
 */
@RestController
public class OrderController {
    @Autowired
    private RestTemplate restTemplate;

    private String url="http://localhost:8001/dept/";

    @GetMapping("/order/getDept/{id}")
    private String getDept(@PathVariable("id")Long id){
        String value=restTemplate.getForObject(url+"getDept/"+id, String.class);
        return value;
    }
}
