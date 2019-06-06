package com.jxl.shabby_for_me.common.untils;

import javax.xml.crypto.Data;

/**
 * 封装Json结果
 */
public class JsonResult {
    private final static Integer SUCCESS = 1;
    private final static Integer ERROR = 0;
    //状态 0:error  1:success
    private Integer status;
    private String message;
    private Object data;
    //
    public JsonResult(){
      this.status = SUCCESS;
      this.message = "SUCCESS";
    }
    //
    public JsonResult(Object data){
        this.status = SUCCESS;
        this.data = data;
    }
    //
    public JsonResult(Throwable throwable){
        this.status = ERROR;
        this.message = throwable.getMessage();
    }

    public Integer getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }

    public Object getData() {
        return data;
    }
}
