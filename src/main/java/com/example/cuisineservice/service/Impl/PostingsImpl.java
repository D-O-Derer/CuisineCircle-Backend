package com.example.cuisineservice.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.cuisineservice.mapper.PostingsMapper;
import com.example.cuisineservice.pojo.Postings;
import com.example.cuisineservice.service.IPostingsService;
import org.springframework.stereotype.Service;

@Service//it is important.We use service to transfer map
public class PostingsImpl extends ServiceImpl<PostingsMapper/*map we use*/, Postings> implements IPostingsService {
}
