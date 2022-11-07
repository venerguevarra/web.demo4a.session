<%@ page language="java" %>
<%@ page import="com.bootcamp.webshoppe.bean.LoginFormBean" %>
<%
LoginFormBean loginFormBean = (LoginFormBean) request.getAttribute("loginFormBean");
%>
<html>
<head>
<title>Welcome to WebShoppe</title>
<style type="text/css">
body {
    margin: 75px;
}
</style>
</head>
<body>
    <h2>Webshoppe E-Commerce</h2>
    <hr/>
    <br/>
    Welcome, <b><%= loginFormBean.getUsername() %></b><br/>
    Your password is <%= loginFormBean.getPassword() %>
</body>
</html>