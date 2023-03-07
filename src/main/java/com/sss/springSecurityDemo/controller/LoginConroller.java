package com.sss.springSecurityDemo.controller;

import com.sss.springSecurityDemo.domain.ResponseResult;
import com.sss.springSecurityDemo.domain.User;
import com.sss.springSecurityDemo.service.LoginServcie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @program: DemoSpringSecurity
 * @description:
 * @author: cx
 * @create: 2023-02-27 16:42
 **/

@RestController
public class LoginConroller {

    @Autowired
    private LoginServcie loginService;

    /**
     * @Description: 登陆接口
     * @Param:
     * @return:
     * @Author: CX
     * @Date: 2023/3/3
     */
    @RequestMapping("/user/login")
    public ResponseResult login(@RequestBody User user) {
//        return new ResponseResult(1,"wtf");
        return loginService.login(user);
    }

    /**
     * @Description: 登出接口
     * @Param:
     * @return:
     * @Author: CX
     * @Date: 2023/3/3
     */
    @RequestMapping("/user/logout")
    public ResponseResult logout() {
        return loginService.logout();
    }
}
