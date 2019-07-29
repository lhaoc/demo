package com.example.demo.service.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author ：Lh
 * @date ：Created in 2019/7/23 0023 11:44
 * @description：${description}
 * @modified By：
 * @version: $version$
 */
@Entity
public class Boy {

    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String sex;

    public Boy() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {

        this.id = id;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getSex() {

        return sex;
    }

    public void setSex(String sex) {

        this.sex = sex;
    }
}
