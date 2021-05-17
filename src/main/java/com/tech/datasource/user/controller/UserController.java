package com.tech.datasource.user.controller;


import com.tech.datasource.user.entity.User;
import com.tech.datasource.user.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author lw
 * @since 2021-05-17
 */
@RestController
@RequestMapping("/user/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @PostMapping("save")
    void save(@RequestBody User user){
        userService.save(user);
    }
}
