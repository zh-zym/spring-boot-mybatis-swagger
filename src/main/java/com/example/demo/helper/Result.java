package com.example.demo.helper;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Created by Macx on 2017/12/1.
 * 对http请求的结果进行封装
 */
@ApiModel(value = "操作结果")
public class Result {

    public static Result Success = success(null);
    public static Result False = fail("接口未实现",1000);

    @ApiModelProperty(value = "结果说明 true = 成功  false = 失败  ",allowableValues = "true,false",required = true)//参数说明  参数肯定会存在
    private boolean success;
    @ApiModelProperty("提示信息")
    private String message;

    @ApiModelProperty("错误信息")
    private String errorMsg;

    @ApiModelProperty("错误代码")
    private int errorCode;

    @ApiModelProperty("操作返回的数据结果")
    private Object data;

    //通用结果返回
    public Result(boolean success) {
        this.success = success;
    }
    //成功快捷构造
    public static Result success(final Object data){
        return new Result(true,data);
    }

    public static Result success(String message){
        return new Result(true,message);
    }

    //失败快捷构造
    public static Result fail(String errorMsg,int errorCode){
        return new Result(false,errorMsg,errorCode);
    }
    //

    public Result(boolean success, String errorMsg, int errorCode) {
        this.success = success;
        this.errorMsg = errorMsg;
        this.errorCode = errorCode;
    }

    public Result(boolean success, Object data) {
        this.success = success;
        this.data = data;
    }
    //操作成功构造函数
    public Result(boolean success, String message) {
        this.success = success;
        this.message = message;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
