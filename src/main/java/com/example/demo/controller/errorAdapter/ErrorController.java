package com.example.demo.controller.errorAdapter;

import com.example.demo.helper.Result;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Macx on 2017/12/2.
 */
@ControllerAdvice
public class ErrorController {

    //处理一般的异常
    //类似参数解析异常之类的
    @ExceptionHandler(Exception.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public Result adapter(){
        return Result.fail("一般异常",1000);
    }



}
