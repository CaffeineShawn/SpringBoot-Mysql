package com.caffeineshawn.thebigiscoming.Entity;

import javafx.beans.binding.MapExpression;

import javax.persistence.Entity;
import javax.xml.ws.Response;
import java.security.MessageDigest;
import java.util.List;


public class LoginResult{
    private int code;
    private String message;
    private List<?> list;
    private Object object;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage(String message) {
        return message;
    }

    LoginResult(int code,String message,Object object) {
        this.code = code;
        this.message = message;
        this.object = object;

    }
}
