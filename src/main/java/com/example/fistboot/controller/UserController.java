package com.example.fistboot.controller;

import com.example.fistboot.model.UserModel;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @RequestMapping("getuser")
    public UserModel getUser(){
        UserModel model = new UserModel();
        model.setUsername("xiaozq");
        model.setNickName("一般吧");
        return model;
    }
}
