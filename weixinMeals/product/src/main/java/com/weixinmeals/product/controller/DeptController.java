package com.weixinmeals.product.controller;

import com.weixinmeals.product.entity.Dept;
import com.weixinmeals.product.enums.ProductEnum;
import com.weixinmeals.product.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author chenyj
 * @Description
 * @Date create by 2019/6/20 22:50
 * 陈银杰专属测试
 */
@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;

    /**
     * @description:
     * @author: chenyj
     * @date: 2019/6/20
     * @param lastName
     * @return
     */
    @GetMapping("/dept/findByLastNameLike/{lastName}")
    public List<Dept> findByLastNameLike(@PathVariable("lastName")String lastName){
        List list=new ArrayList();
        try {
            list=deptService.findByLastNameLike(lastName);
            list=deptService.findByLastNameLike(ProductEnum.up.getCode());
        }catch (Exception e){
            e.printStackTrace();
        }
        return list;
    }
}
