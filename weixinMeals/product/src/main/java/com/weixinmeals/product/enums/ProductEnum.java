package com.weixinmeals.product.enums;

import lombok.Getter;

/**
 * @Author chenyj
 * @Description
 * @Date create by 2019/6/20 23:00
 * 陈银杰专属测试
 */
@Getter
public enum  ProductEnum {
    up("cloud01","微服务"),
    down("cloud01","弹簧靴");

    private String code;
    private String message;

    ProductEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }
}
