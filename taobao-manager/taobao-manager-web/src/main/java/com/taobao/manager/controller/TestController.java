package com.taobao.manager.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.taobao.manager.service.TestService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 测试
 */
@Controller
public class TestController {

    @Reference
    TestService service;

    @RequestMapping("/testquerynow")
    @ResponseBody
    public String queryNow() {
        return service.queryNow();
    }

}
