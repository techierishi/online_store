package com.rishi.onlinestore.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.rishi.onlinestore.model.User;
import com.rishi.onlinestore.service.RegisterService;

public class RegisterAction extends ActionSupport {

    private User user = new User();

    private RegisterService userService;

    private Map<String, Object> session;


    private HttpServletRequest request;

    private HttpServletResponse response;

    public String register() {
        session = (Map) ActionContext.getContext().getSession();
        String ret = "";
        try {
          
            ret = SUCCESS;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return ret;

    }

    public String usersave() {

        session = (Map) ActionContext.getContext().getSession();
        String ret = ERROR;
        try {
            RegisterService registerService = new RegisterService();
            boolean result = registerService.register(user);
            ret = SUCCESS;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return ret;


    }

}
