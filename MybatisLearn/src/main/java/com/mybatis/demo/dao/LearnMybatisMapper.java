package com.mybatis.demo.dao;

import com.mybatis.demo.mapper.LearnMybatis;

public interface LearnMybatisMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LearnMybatis record);

    int insertSelective(LearnMybatis record);

    LearnMybatis selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LearnMybatis record);

    int updateByPrimaryKey(LearnMybatis record);
}