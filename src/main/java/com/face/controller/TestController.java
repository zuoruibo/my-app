package com.face.controller;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.face.bean.User;
import com.face.config.Config;
import com.face.mapper.UserMapper;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/test")
public class TestController {

    private final UserMapper userMapper;

    private final Config config;

    @GetMapping("/demo")
    public String test() {
        LambdaQueryWrapper<User> queryWrapper = new LambdaQueryWrapper<>();
        List<User> list = userMapper.selectList(queryWrapper);
        return JSON.toJSONString(list) + config.getPassword();
    }

}
