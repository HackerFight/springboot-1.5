package com.qiuguan.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author qiuguan
 * @date 2022/09/28 00:03:49  星期三
 */
@Controller
public class HelloController {

    @GetMapping("/hello222")
    public String hello(){
        /**
         * 前缀和后缀组合成：/custom/index.html
         */
        return "zxy";
    }
}
