package com.chenyj.controller;


import com.chenyj.pojo.Dept;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author chenyj
 * @Description
 * @Date create by 2019/6/16 21:48
 * 陈银杰专属测试
 */
@RestController
public class DeptController {

    @GetMapping("/dept/getDept/{id}")
    public String getDept(@PathVariable("id") Long id){
        System.out.println("当前端口：8001");
//        Dept dept=new Dept(id, "陈银杰", "cloud01");
        return "老子天下无敌";
    }
}
