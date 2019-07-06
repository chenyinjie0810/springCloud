package com.weixinmeals.product.service.impl;

import com.weixinmeals.product.repository.DeptRepository;
import com.weixinmeals.product.entity.Dept;
import com.weixinmeals.product.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author chenyj
 * @Description
 * @Date create by 2019/6/20 22:47
 * 陈银杰专属测试
 */
@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptRepository deptRepository;
    @Override
    public List<Dept> findByLastNameLike(String lastName) {
        Pageable pageable=new PageRequest(1,1);
        deptRepository.findAll(pageable);
        return deptRepository.findByLastName(lastName);
    }
}
