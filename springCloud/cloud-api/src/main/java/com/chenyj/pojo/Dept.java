package com.chenyj.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @Author chenyj
 * @Description
 * @Date create by 2019/6/16 22:03
 * 陈银杰专属测试
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain=true)
public class Dept implements Serializable {

    private Long id;
    private String lastName;
    private String db_source;

    /*public Dept() {
    }

    public Dept(Long id, String lastName, String db_source) {
        this.id = id;
        this.lastName = lastName;
        this.db_source = db_source;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDb_source() {
        return db_source;
    }

    public void setDb_source(String db_source) {
        this.db_source = db_source;
    }*/

}
