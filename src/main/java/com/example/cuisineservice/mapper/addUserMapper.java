package com.example.cuisineservice.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.cuisineservice.pojo.addUser;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface addUserMapper extends BaseMapper<addUser> {//this is map,extends BaseMapper
}
