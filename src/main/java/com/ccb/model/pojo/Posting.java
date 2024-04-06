package com.ccb.model.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.apache.ibatis.jdbc.Null;

import java.time.LocalDateTime;

@TableName("posting")
@Data
@AllArgsConstructor

public class Posting {
    String context;
    Integer id;



    public Posting() {


    }
}
