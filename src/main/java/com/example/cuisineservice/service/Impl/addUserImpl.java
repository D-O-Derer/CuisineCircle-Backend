package com.example.cuisineservice.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.cuisineservice.mapper.addUserMapper;
import com.example.cuisineservice.pojo.addUser;
import com.example.cuisineservice.service.IaddUserService;
import org.springframework.stereotype.Service;

@Service//it is important.We use service to transfer map
public class addUserImpl extends ServiceImpl<addUserMapper/*map we use*/, addUser> implements IaddUserService {
}
