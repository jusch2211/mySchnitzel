<%--
  Created by IntelliJ IDEA.
  User: Jusch
  Date: 07.05.2016
  Time: 20:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
    <form action="/AuthServlet" method="post">
        Name: <input type="text" name="name"/>
        Password: <input type="password" name="password"/>
    <input type="submit" value="LogIn"/>
</form>
</body>
</html>
