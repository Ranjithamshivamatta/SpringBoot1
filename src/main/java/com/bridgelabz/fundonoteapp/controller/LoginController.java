package com.bridgelabz.fundonoteapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.fundonoteapp.model.User;
import com.bridgelabz.fundonoteapp.service.UserService;

@RestController
@ComponentScan("com.bl.app.user.service")
public class LoginController {
    
    @Autowired
    UserService userService;
    
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String geteUserByLogin(@RequestBody User user) {
        
        System.out.println("I am a Controller");    
        return userService.login(user);
        
    }  }