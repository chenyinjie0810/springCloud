package com.chenyj.service.fallbackFactory;

import com.chenyj.pojo.Dept;
import com.chenyj.service.DeptService;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * @Author chenyj
 * @Description
 * @Date create by 2019/7/13 13:29
 * 陈银杰专属测试
 */
@Component
public class DeptServiceFallbackFactory implements FallbackFactory<DeptService> {
    @Override
    public DeptService create(Throwable throwable) {
        return new DeptService() {
            @Override
            public String getDept(Long id) {
                return new Dept(id,"没有查询到该数据","no this database in MySQL").toString();
            }
        };
    }
}
