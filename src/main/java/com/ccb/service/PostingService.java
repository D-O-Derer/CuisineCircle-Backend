package com.ccb.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ccb.model.pojo.Picture;
import com.ccb.model.pojo.Posting;

import java.util.List;

public interface PostingService extends IService<Posting> {
    void saveMain(Posting poi, List<Picture> pic);
    void deleteMain(Integer id);
    void updateMain(Posting poi, List<Picture>pics);
}
