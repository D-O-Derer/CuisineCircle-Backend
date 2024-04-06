package com.ccb.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ccb.mapper.PictureMapper;
import com.ccb.mapper.PostingMapper;
import com.ccb.model.pojo.Picture;
import com.ccb.model.pojo.Posting;
import com.ccb.service.PostingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service//it is important.We use service to transfer map
public class PostingServiceImpl extends ServiceImpl<PostingMapper/*map we use*/, Posting> implements PostingService {
    @Autowired
    private PostingMapper poiMapper;
    @Autowired
    private PictureMapper picMapper;
    @Override
    public void saveMain(Posting poi, List<Picture> pics){
        poiMapper.insert(poi);
        if(pics!=null){
            for (Picture pic:pics){
                pic.setPoiId(poi.getId());
                picMapper.insert(pic);

            }

        }


    }

    @Override
    public void deleteMain(Integer id) {
        poiMapper.deleteById(id);
//        QueryWrapper query= new QueryWrapper();
//        query.eq("poi_id",id);
//        picMapper.delete(query);//we can implement delete by it,or we can use SQL language
        picMapper.deleteByPicId(id);


    }

    @Override
    public void updateMain(Posting poi, List<Picture> pics) {
        poiMapper.updateById(poi);
        picMapper.deleteByPicId(poi.getId());
        if(pics!=null){
            for (Picture pic:pics){
                pic.setPoiId(poi.getId());
                picMapper.insert(pic);

            }

        }


    }
}
