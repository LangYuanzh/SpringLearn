package com.mybatis.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CLITest implements CommandLineRunner {

    @Override
    public void run(String... args)throws Exception{
        System.out.println("Command line runner run");
    }
}
