package com.ccb.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.IService;
import com.ccb.model.pojo.Posting;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PostingMapper extends BaseMapper<Posting> {//this is map,extends BaseMapper
}
