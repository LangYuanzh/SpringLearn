package com.mybatis.demo.controller;

import com.mybatis.demo.mapper.LearnMybatis;
import com.mybatis.demo.service.LearnMybatisServImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@ResponseBody
@Controller
@RequestMapping("/")
public class HomeController {

    @Autowired
    private LearnMybatisServImpl learnMybatisServImpl;

    @RequestMapping("home")
    public String home(){
        return "home";
    }

    @RequestMapping("param")
    public String param(@RequestParam("param") String param){
        return param;
    }

    @RequestMapping("form")
    public LearnMybatis form(LearnMybatis record){
        learnMybatisServImpl.insert(record);
        return record;
    }
}
