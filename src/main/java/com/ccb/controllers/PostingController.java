package com.ccb.controllers;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ccb.form.PostingForm;
import com.ccb.model.pojo.Picture;
import com.ccb.model.pojo.Posting;
import com.ccb.service.PictureService;
import com.ccb.service.PostingService;
import com.ccb.vo.PostingVo;
import com.ccb.vo.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/posting")
public class PostingController {
    @Autowired
    private PostingService poiService;//autowired the poiService
    @Autowired
    private PictureService picService;
    @PostMapping("/detail")
    public Result detail(@PathVariable/*it is important,because the way to use /123,we should tell the idea to use it*/ Integer id){
        log.info("poi detail id={}",id);//log,from lombok,we can show the data to the controller
//        var poiVo = new PoiVo();
//        poiVo.name="lisi";
//        poiVo.description="this is lisi";
        Posting poi=poiService.getById(id);
//        List voList=new ArrayList();//set a new list
        PostingVo poiVo=new PostingVo();
        BeanUtils.copyProperties(poi,poiVo);//this two lines can implement the Poi to PoiVo
        QueryWrapper query= new QueryWrapper();
        query.eq("poi_id",poi.getId());
        List<Picture> pics=picService.list(query);//to get the data from Pic.In fact,we get Poi first,then we transfer the Poi to PoiVo,then we get the Pic,finally we set the Pic to the PoiVo
        poiVo.setPicture(pics);
//        voList.add(poiVo);

        return Result.success(poiVo);
    }
    @PostMapping("/add")
    public Result add(@RequestBody PostingForm poiForm){//use the way of post,which means we add new data,RequestBody tells maven to transfer the json to Poi
        log.info("poi detail poi={}",poiForm);
        Posting poi=new Posting();
        BeanUtils.copyProperties(poiForm,poi);
        poiService.saveMain(poi,poiForm.getPicture());//set add

//        PoiVo poiVo=new PoiVo();
//        BeanUtils.copyProperties(poi,poiVo);//this two lines can implement the Poi to PoiVo

        return detail(poi.getId());
    }
    @PutMapping("/edit/{id}")
    public Result edit(@RequestBody PostingForm poiForm,@PathVariable Integer id){//use the way of edit ,which means we change the data
        log.info("poi detail ={}",poiForm);
        Posting poi=new Posting();
        BeanUtils.copyProperties(poiForm,poi);
        poi.setId(id);
        poiService.updateMain(poi,poiForm.getPicture());
        return Result.success();
    }
    @DeleteMapping("/delete/{id}")
    public Result delete(@PathVariable int id){//use the way of delete.which means we delete the data

        log.info("poi delete id={}",id);
//        poi.setId(id);
//        poiService.removeById(id);//we use id here
        poiService.deleteMain(id);

        return Result.success();
    }
}
