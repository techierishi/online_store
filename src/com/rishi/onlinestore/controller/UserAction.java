package com.rishi.onlinestore.controller;

import com.opensymphony.xwork2.ActionContext;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.rishi.onlinestore.model.User;
import com.rishi.onlinestore.service.UserService;
import java.util.Map;

public class UserAction extends ActionSupport {

    private Map<String, Object> session;
    private User user = new User();

    private UserService userService;

    private HttpServletRequest request;

    private HttpSession httpsession;

    private ServletContext application;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String login() throws Exception {
        this.request = ServletActionContext.getRequest();
        this.httpsession = this.request.getSession();

        String ret = "";

        userService = new UserService();
        boolean result = userService.authenticateUser(user.getUserId(), user.getPassword());
        User _user = userService.getUserByUserId(user.getUserId());
        if (result == true) {
            request.getSession().setAttribute("user", _user);
            ret = "profile";
        } else {
            ret = "login";
        }

        return ret;

    }

    public String register() {
        session = (Map) ActionContext.getContext().getSession();
        String ret = "register";

        try {

            if (null != user) {
                session = (Map) ActionContext.getContext().getSession();
                userService = new UserService();
                boolean result = userService.register(user);
                ret = "register";

            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return ret;

    }

}
