package com.example.cuisineservice.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.cuisineservice.mapper.HomePageMapper;
import com.example.cuisineservice.pojo.HomePage;
import com.example.cuisineservice.service.IHomepageService;
import org.springframework.stereotype.Service;

@Service//it is important.We use service to transfer map
public class HomePageImpl extends ServiceImpl<HomePageMapper/*map we use*/, HomePage> implements IHomepageService {
}
