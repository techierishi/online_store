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
    private ServletContext application;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String login() throws Exception {
        this.request = ServletActionContext.getRequest();

        String ret = "";

        userService = new UserService();
        boolean result = userService.authenticateUser(user.getEmail(), user.getPassword());
        User _user = userService.getUserByUserId(user.getEmail());

        Map session = ActionContext.getContext().getSession();
        session.put("user", _user);
        if (result == true) {
            ret = "profile";
        } else {
            ret = "login";
        }

        return ret;

    }

    public String profile() throws Exception {
        this.request = ServletActionContext.getRequest();

        String ret = "";

        userService = new UserService();
        Map session = ActionContext.getContext().getSession();

        User _user = (User) session.get("user");
        if (_user != null) {
            ret = "profile";
        } else {
            ret = "profile";
        }

        return ret;

    }

    public String register() {
        String ret = "register";

        try {

            if (null != user) {
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
