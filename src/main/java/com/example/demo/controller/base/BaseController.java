package com.example.demo.controller.base;

import com.example.demo.helper.Result;
import com.example.demo.service.base.BaseService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Macx on 2017/12/2.
 * 基础抽象接口
 */

public abstract class BaseController<T> {

    //业务
    public abstract BaseService<T> getService();

    @ApiOperation("单个添加")
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    @ResponseBody
    public Result add(@RequestBody T example){
        getService().add(example);
        return Result.Success;
    }

    @ApiOperation("单个删除")
    @RequestMapping(value = "/delete/{id}",method = RequestMethod.DELETE)
    @ResponseBody
    public Result delete(@PathVariable("id") Integer id){
        getService().delete(id);
        return Result.Success;
    }

    @ApiOperation("单个更新")
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    @ResponseBody
    public Result update(@RequestBody T example){
        getService().update(example);
        return Result.Success;
    }

    @ApiOperation("单个查询")
    @RequestMapping(value = "/findOne/{id}",method = RequestMethod.GET)
    @ResponseBody
    public Result findOne(@PathVariable("id")Integer id){
        return Result.success(getService().findOne(id));
    }

    @ApiOperation("查询所有")
    @RequestMapping(value = "/findAll",method = RequestMethod.GET)
    @ResponseBody
    public Result findAll(){
        return Result.success(getService().findAll());
    }

    @ApiOperation("分页查询")
    @RequestMapping(value = "/page",method = RequestMethod.GET)
    public Result findByPage(@RequestParam(value = "page",defaultValue = "1",required = false) Integer page ,
                             @RequestParam(value = "limit",defaultValue = "20",required = false) Integer limit){
        Map<String,Object> map = new HashMap<>();
        map.put("count",getService().count());
        map.put("list",getService().findByPage(page,limit));
        return Result.success(map);
    }

}
