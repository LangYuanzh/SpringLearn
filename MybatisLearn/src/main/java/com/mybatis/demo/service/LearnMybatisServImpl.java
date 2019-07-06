package com.mybatis.demo.service;

import com.mybatis.demo.dao.LearnMybatisMapper;
import com.mybatis.demo.mapper.LearnMybatis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LearnMybatisServImpl implements LearnMybatisServ {

    @Autowired
    private LearnMybatisMapper learnMybatisMapper;

    @Override
    public void insert(LearnMybatis record){
        int i = learnMybatisMapper.insert(record);
    }
}
