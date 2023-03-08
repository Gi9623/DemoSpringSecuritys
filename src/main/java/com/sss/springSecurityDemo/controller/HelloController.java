package com.sss.springSecurityDemo.controller;

import com.sss.springSecurityDemo.domain.User;
import com.sss.springSecurityDemo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program: DemoSpringSecurity
 * @description:
 * @author: cx
 * @create: 2023-02-17 15:50
 **/
@RestController
public class HelloController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/hello")
    @PreAuthorize("hasAuthority('sys:test1')")
    public String hello(){
        return "hello";
    }

    @RequestMapping("hello3")
    @PreAuthorize("hasAuthority('test3')")
    public String test3(@RequestBody User user) {
        return "hello word3";
    }

    @RequestMapping("hello2")
    public String test2() {
        List<User> users = userMapper.selectList(null);
        return users.toString();
    }
}
