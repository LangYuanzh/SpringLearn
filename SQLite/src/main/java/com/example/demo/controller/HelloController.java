package com.example.demo.controller;

import com.example.demo.model.HelloModel;
import com.example.demo.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
public class HelloController {

    private final HelloService helloService;

    @Autowired
    public HelloController(HelloService helloService){
        this.helloService = helloService;
    }
    @RequestMapping("/")
    public String Index() {
        return "Hello World";
    }

    @RequestMapping("/list")
    public List<HelloModel> List(){
        return helloService.selectAll();
    }

    @RequestMapping(value = "/post1", method = RequestMethod.POST)
    public String Post(
            @RequestBody com.example.demo.model.RequestBody map
    ) throws IOException {
        System.out.println("asdasdadadad");
        return "输入的姓名是" + map.getName() + ",电子邮件是:" + map.getEmail();
    }

    @RequestMapping("/post")
    @ResponseBody
    public HelloModel post(HelloModel helloModel){
        System.out.println(helloModel.getId()+helloModel.getText()+helloModel.getTitle());
        helloService.insert(helloModel);
        return helloModel;
    }
}
