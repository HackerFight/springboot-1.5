package com.qiuguan.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author qiuguan
 * @date 2022/09/28 00:03:49  星期三
 */
@Controller
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "index";
    }
}
