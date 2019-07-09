package com.mybatis.demo.dao;

import com.mybatis.demo.mapper.LearnMybatis;
import com.mybatis.demo.mapper.LearnMybatisExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface LearnMybatisMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LearnMybatis record);

    int insertSelective(LearnMybatis record);

    LearnMybatis selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") LearnMybatis record, @Param("example") LearnMybatisExample example);

    int updateByExample(@Param("record") LearnMybatis record, @Param("example") LearnMybatisExample example);

    int updateByPrimaryKeySelective(LearnMybatis record);

    int updateByPrimaryKey(LearnMybatis record);
}