package com.springcloud.service_ribbon.controller;

import com.springcloud.service_ribbon.serviceImpl.HelloService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Api(description = "账号接口")
@RestController
public class HelloController {
    @Autowired
    HelloService helloService;

    @ApiOperation(value = "测试",notes = "test")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query",name="name",value="用户名",required = true,dataType = "String"),
    })
    @RequestMapping(value = "/hi", method = {RequestMethod.GET})
    public String hi(@RequestParam String name){
        return helloService.hiService(name);
    }
}
