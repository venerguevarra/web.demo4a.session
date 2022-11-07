package com.bootcamp.webshoppe.service;

import com.bootcamp.webshoppe.bean.LoginFormBean;

public class AuthenticationService {
    public void authenticate(LoginFormBean loginFormBean) {
        if(!"admin".equals(loginFormBean.getUsername()) || !"pass123".equals(loginFormBean.getPassword())) {
            throw new RuntimeException("Invalid username and password!");
        }
    }
}
