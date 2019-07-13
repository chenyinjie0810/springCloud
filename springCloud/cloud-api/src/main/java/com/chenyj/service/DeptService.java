package com.chenyj.service;

import com.chenyj.service.fallbackFactory.DeptServiceFallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author chenyj
 * @Description
 * @Date create by 2019/7/11 22:36
 * 陈银杰专属测试
 */
@FeignClient(value ="provider-user" ,fallbackFactory = DeptServiceFallbackFactory.class)
public interface DeptService {

    @RequestMapping("/dept/getDept/{id}")
    String getDept(@PathVariable("id") Long id);
}
