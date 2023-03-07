package com.sss.springSecurityDemo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sss.springSecurityDemo.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

//@Mapper
public interface UserMapper extends BaseMapper<User> {
}
