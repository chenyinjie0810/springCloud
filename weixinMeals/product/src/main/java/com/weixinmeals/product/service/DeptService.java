package com.weixinmeals.product.service;

import com.weixinmeals.product.entity.Dept;

import java.util.List;

/**
 * @Author chenyj
 * @Description
 * @Date create by 2019/6/20 22:46
 * 陈银杰专属测试
 */
public interface DeptService {

    List<Dept> findByLastNameLike(String lastName);
}
