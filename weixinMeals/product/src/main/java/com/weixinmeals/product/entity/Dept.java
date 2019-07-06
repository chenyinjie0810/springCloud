package com.weixinmeals.product.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @Author chenyj
 * @Description
 * @Date create by 2019/6/20 22:04
 * 陈银杰专属测试
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Dept{

   @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    private String lastName;
    private String adress;
    private String dbSource;
}
