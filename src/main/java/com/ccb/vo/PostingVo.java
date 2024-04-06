package com.ccb.vo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.List;

@TableName("posting")//it is same as class Poi
@Data
public class PostingVo {//PoiVo is used to transfer the data to the client
    private String context;

    private Integer id;
    private List picture;


}
