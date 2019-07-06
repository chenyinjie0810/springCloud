package com.weixinmeals.product.repository;

import com.weixinmeals.product.entity.Dept;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Author chenyj
 * @Description
 * @Date create by 2019/6/20 22:09
 * 陈银杰专属测试
 */
public interface DeptRepository extends JpaRepository<Dept,Integer> {

    List<Dept> findByLastName(String lastName);
}
