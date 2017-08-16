package com.ycl.spring.controller;

import com.ycl.spring.pojo.UserEntity;
import com.ycl.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
@Controller
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("userInfo")
    @ResponseBody
    public List<UserEntity> userinfo(String id){
        List<UserEntity> list = userService.findUserById(id);
        return list;
     }

}
