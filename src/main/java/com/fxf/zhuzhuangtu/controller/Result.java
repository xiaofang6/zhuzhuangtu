package com.fxf.zhuzhuangtu.controller;

public class Result {

    /**
     * 返回状态码 0成功 1失败
     */
    private Integer code;
    /**
     * 返回信息说明
     */
    private String msg;
    /**
     * 返回数据量
     */
    private Integer count = 1;
    /**
     * 返回数据
     */
    private Object data;

    public Result() {
    }


    public Result(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }


    public Result(Integer code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public Result(Integer code, String msg, Integer count, Object data) {
        this.code = code;
        this.msg = msg;
        this.count = count;
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
