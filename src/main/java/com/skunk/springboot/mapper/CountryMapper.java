package com.skunk.springboot.mapper;

import com.skunk.springboot.model.Country;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CountryMapper {
    int deleteByPrimaryKey(Integer cId);

    int insert(Country record);

    int insertSelective(Country record);

    Country selectByPrimaryKey(Integer cId);

    int updateByPrimaryKeySelective(Country record);

    int updateByPrimaryKey(Country record);
}