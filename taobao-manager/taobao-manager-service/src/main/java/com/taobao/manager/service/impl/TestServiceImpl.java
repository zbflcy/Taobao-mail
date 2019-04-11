package com.taobao.manager.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.taobao.manager.mapper.TestMapper;
import com.taobao.manager.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class TestServiceImpl implements TestService {
    @Autowired
    TestMapper mapper;
    @Override
    public String queryNow() {
        return mapper.queryNow();
    }
}
