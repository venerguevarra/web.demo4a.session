<%@ page language="java"%>
<html>
<head>
<title>Login Form</title>
<style type="text/css">
body {
	margin: 75px;
}
</style>
</head>
<body>
    <h2>Webshoppe Login</h2>
    <hr/>
    <div style="margin-top: 25px;">
        <form action="./login" method="POST">
            Username <input type="text" name="username"><br/>
            Password <input type="password" name="password"><br/>
            <input type="submit" value="Login">
        </form>
    </div>
</body>
</html>