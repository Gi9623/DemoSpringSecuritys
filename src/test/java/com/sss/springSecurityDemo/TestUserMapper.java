package com.sss.springSecurityDemo;

import com.sss.springSecurityDemo.config.SecurityConfig;
import com.sss.springSecurityDemo.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * @program: DemoSpringSecurity
 * @description:
 * @author: cx
 * @create: 2023-02-24 13:47
 **/
@SpringBootTest
public class TestUserMapper {
    @Autowired
    private UserMapper userMapper;

    @Autowired
    private SecurityConfig securityConfig;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Test
    public void test2(){
        //$2a$10$.dBsBvFu0gW85FNEyKy3I..6i6nLTg9KPBhcUcu0sMyCvr/UclShi
        //$2a$10$gAjkgHkhllEOcqBYOTN6aupQjqayqs2cgsSz8ofIOsteJVE7hQXyu
        System.out.println(bCryptPasswordEncoder.encode("123456"));
        System.out.println(bCryptPasswordEncoder.encode("123456"));
        System.out.println(bCryptPasswordEncoder.matches("123456", "$2a$10$.dBsBvFu0gW85FNEyKy3I..6i6nLTg9KPBhcUcu0sMyCvr/UclShi"));
        System.out.println(bCryptPasswordEncoder.matches("1234562", "$2a$10$.dBsBvFu0gW85FNEyKy3I..6i6nLTg9KPBhcUcu0sMyCvr/UclShi"));

    }

    @Test
    public void test(){
        System.out.println(userMapper.selectList(null));
    }
}
