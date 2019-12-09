package com.skunk.springboot.controller;

import com.skunk.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MybatisController {

    @Autowired
    private UserService userService;


    /**
     * http://localhost:8080/boot/users
     * @return
     */
    @GetMapping(path = "/boot/users")
    @ResponseBody
    public Object users() {
        return userService.getAllUser();
    }

}
