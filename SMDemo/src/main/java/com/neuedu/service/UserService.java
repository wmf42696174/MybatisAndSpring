package com.neuedu.service;

import com.neuedu.dao.mapper.UserMapper;
import com.neuedu.entity.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2017-04-18.
 */
@Service
public class UserService {

    @Resource
    private UserMapper userMapper;

    public List<User> FindAllUser(){
        return userMapper.FindAllUser();
    }
}
