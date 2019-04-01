package com.api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: QiaoYaJun
 * @Description
 * @Created 2019-03-09 23:56
 */
@RestController
@RequestMapping("common/")
public class Common {

    @RequestMapping("test")
    public Object test() {
        return "hellow";
    }
}
