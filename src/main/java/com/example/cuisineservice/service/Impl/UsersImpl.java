package com.example.cuisineservice.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.cuisineservice.mapper.UsersMapper;
import com.example.cuisineservice.pojo.Users;
import com.example.cuisineservice.service.IUsersService;
import org.springframework.stereotype.Service;

@Service//it is important.We use service to transfer map
public class UsersImpl extends ServiceImpl<UsersMapper/*map we use*/, Users> implements IUsersService {
}
