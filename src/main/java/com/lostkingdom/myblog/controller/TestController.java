package com.lostkingdom.myblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    @RequestMapping(value = "/test.do")
    @ResponseBody
    public String testMethod(){
        return "test ok";
    }

}
