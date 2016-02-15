package com.rishi.onlinestore.controller;

import javax.annotation.Resource;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.rishi.onlinestore.model.User;
import com.rishi.onlinestore.service.LoginService;

public class LoginAction extends ActionSupport {

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

    @Override
    public String execute() throws Exception {
        this.request = ServletActionContext.getRequest();
        this.session = this.request.getSession();

        String ret = "";

        LoginService loginService = new LoginService();
        boolean result = loginService.authenticateUser(username, password);
        User user = loginService.getUserByUserId(username);
        if (result == true) {
            request.getSession().setAttribute("user", user);
            ret = SUCCESS;
        } else {
            ret = ERROR;
        }

        return ret;

    }

}
