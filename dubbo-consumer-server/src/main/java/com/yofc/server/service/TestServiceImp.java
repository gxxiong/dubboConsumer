package com.yofc.server.service;

import com.yofc.api.response.service.ITestService;
import org.apache.dubbo.config.annotation.Service;

@Service
public class TestServiceImp implements ITestService {
    @Override
    public String getTest() {
        return "你好";
    }
}
