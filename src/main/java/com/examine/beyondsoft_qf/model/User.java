package com.examine.beyondsoft_qf.model;

import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2019/01/21.
 */
@Repository
public class User {
    /** 主键 */
    private Integer id;
    /** 姓名 */
    private String name;
    /**  年龄 */
    private Integer age;

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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "UserDao: " + "姓名： " +  this.name + "年龄： " + this.age;
    }
}
