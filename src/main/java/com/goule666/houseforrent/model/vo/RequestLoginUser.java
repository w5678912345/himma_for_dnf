package com.goule666.houseforrent.model.vo;

import javax.validation.constraints.NotNull;

/**
 * @author niewenlong
 * @Date 2017-10-25 14:12:09
 * @Description 用户登陆接口参数的实体类
 */
public class RequestLoginUser {

    @NotNull
    private String username;

    @NotNull
    private String password;

    public RequestLoginUser() {
    }

    public String getUsername() {
        return username;
    }

    public RequestLoginUser setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public RequestLoginUser setPassword(String password) {
        this.password = password;
        return this;
    }

    @Override
    public String toString() {
        return "RequestLoginUser{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
