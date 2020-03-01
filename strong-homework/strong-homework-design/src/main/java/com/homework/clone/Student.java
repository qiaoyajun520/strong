package com.homework.clone;

import com.alibaba.fastjson.JSON;
import lombok.Data;

import java.util.List;

/**
 * @Author: QiaoYaJun
 * @Description
 * @Created 2020-03-01 11:32
 */
@Data
public class Student implements Cloneable {
    private String name;
    private int age;
    private List<String> likes;

    @Override
    public Student clone() {
        try {
            return (Student) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    public Student deepClone() {
        String json = JSON.toJSONString(this);
        return JSON.parseObject(json,Student.class);
    }
}
