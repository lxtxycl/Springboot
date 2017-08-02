package com.ycl.spring.dao;

import com.ycl.spring.pojo.UserEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by Admin on 2017/8/2.
 */
@Mapper
public interface UserDao {

    public List<UserEntity> findUserById(String id);
}
