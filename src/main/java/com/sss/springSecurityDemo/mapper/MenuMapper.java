package com.sss.springSecurityDemo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sss.springSecurityDemo.domain.Menu;

import java.util.List;

public interface MenuMapper extends BaseMapper<Menu> {

    List<String> selectPermsByUserId(Long id);
}
