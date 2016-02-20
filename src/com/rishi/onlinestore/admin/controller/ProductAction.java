package com.rishi.onlinestore.admin.controller;

import com.rishi.onlinestore.controller.*;
import javax.annotation.Resource;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.rishi.onlinestore.model.User;
import com.rishi.onlinestore.service.LoginService;

public class ProductAction extends ActionSupport {

    private String username;

    private String password;

    private LoginService userService;

    private HttpServletRequest request;

    private HttpSession session;

    private ServletContext application;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String addproduct() throws Exception {
        
        String ret = "";

        
        if (true) {
            ret = SUCCESS;
        } else {
            ret = ERROR;
        }

        return ret;

    }

}
