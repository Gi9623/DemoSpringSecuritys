package com.sss.springSecurityDemo.service;

import com.sss.springSecurityDemo.domain.ResponseResult;
import com.sss.springSecurityDemo.domain.User;

public interface LoginServcie {
    ResponseResult login(User user);

    ResponseResult logout();

}
