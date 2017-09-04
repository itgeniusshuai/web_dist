package com.boot.common;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class GlobalResult implements Serializable{
    private int code;
    private String msg;
    private Object data;

    public static GlobalResult ok(){
        return new GlobalResult(1, "接口访问成功！！！");
    }

    public static GlobalResult ok(Object data){
        return new GlobalResult(1, data);
    }

    public static GlobalResult error(int code, String msg){
        return new GlobalResult(code, msg);
    }

    public GlobalResult(int code, String msg) {
        super();
        this.code = code;
        this.msg = msg;
    }

    public GlobalResult() {
        super();
    }

    public GlobalResult(int code, Object data) {
        super();
        this.code = code;
        this.data = data;
    }
}
