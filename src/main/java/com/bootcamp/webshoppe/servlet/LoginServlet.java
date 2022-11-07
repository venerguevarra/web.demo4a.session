package com.bootcamp.webshoppe.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bootcamp.webshoppe.bean.LoginFormBean;
import com.bootcamp.webshoppe.service.AuthenticationService;

@WebServlet(urlPatterns = "/login", loadOnStartup = 1)
public class LoginServlet extends HttpServlet {

    private static final long serialVersionUID = 3327146866618129023L;

    private AuthenticationService authenticationService;

    @Override
    public void init() throws ServletException {
        authenticationService = new AuthenticationService();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        LoginFormBean loginFormBean = this.toFormBean(request);

        String resultPage = "/pages/success.jsp";
        try {
            authenticationService.authenticate(loginFormBean);
            request.setAttribute("loginFormBean", loginFormBean);
        } catch (Exception e) {
            resultPage = "/pages/error.jsp";
        }

        RequestDispatcher dispatcher = request.getRequestDispatcher(resultPage);
        dispatcher.forward(request, response);
    }

    private LoginFormBean toFormBean(HttpServletRequest request) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        LoginFormBean loginFormBean = new LoginFormBean(username, password);
        return loginFormBean;
    }

}
