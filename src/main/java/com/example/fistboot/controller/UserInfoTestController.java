package com.example.fistboot.controller;

import com.example.fistboot.dao.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserInfoTestController {
    @Autowired
    private UserRepository userRepository;
    @RequestMapping(value = "/getuserList")
    public String getUserList(Model model){
        System.out.println("userList Controller");
        model.addAttribute("hello","Hello, Spring Boot!");
        model.addAttribute("userList", userRepository.findAll());
        return "user/userlist";
    }
}
