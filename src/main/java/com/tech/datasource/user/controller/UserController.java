package com.tech.datasource.user.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.tech.datasource.user.entity.User;
import com.tech.datasource.user.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author lw
 * @since 2021-05-17
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @PostMapping("save")
    void save(@RequestBody User user){
        userService.save(user);
    }

    @GetMapping("p")
    IPage<User> pages(){
        IPage<User> page=new Page<>();
        page.setPages(1);
        page.setSize(3);
        return userService.page(page);
    }
}
