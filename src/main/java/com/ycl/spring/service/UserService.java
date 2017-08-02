package com.ycl.spring.service;

import com.ycl.spring.dao.UserDao;
import com.ycl.spring.pojo.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Admin on 2017/8/2.
 */
@Component
public class UserService {
    @Autowired
    UserDao userDao;
    public List<UserEntity> findUserById(String id){
        return userDao.findUserById(id);
    }
}
