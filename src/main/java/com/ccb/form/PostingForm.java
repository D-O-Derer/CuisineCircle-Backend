package com.ccb.form;

import com.ccb.model.pojo.Picture;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class PostingForm {
    String context;
    Integer id;
    LocalDateTime time;
    private List<Picture> picture;

}
