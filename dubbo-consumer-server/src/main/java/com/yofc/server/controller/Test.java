package com.yofc.server.controller;

import com.yofc.api.response.service.ITestService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {

    @Reference
    private ITestService testService;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String getTest(@RequestParam String a) {
        a = testService.getTest();
        return a;
    }
}
