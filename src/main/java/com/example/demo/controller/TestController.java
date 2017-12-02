package com.example.demo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Macx on 2017/12/1.
 */
@Api(value = "测试",description = "测试")
@RestController
public class TestController {


    @ApiOperation(value = "方法说明",notes = "方法说明详细")
    @PostMapping(value = "/api/test1")
    public Map<String,Object> testmethod(@ApiParam(name = "data",required = true,value = "姓名")
                                             @RequestParam("data") String data){
        Map<String,Object> map = new HashMap<>();
        map.put("status",false);
        return new HashMap<>();
    }



    @ApiOperation(value = "方法说明1",notes = "方法说明详细1")
    @PostMapping(value = "/api/test2")
    public Map<String,Object> testmethod1(@ApiParam(name = "data1",required = true,value = "姓名")
                                         @RequestParam("data1") String data){
        return new HashMap<>();
    }
}
