package com.face.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.face.bean.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {
}
