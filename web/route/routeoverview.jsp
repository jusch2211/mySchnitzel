<%--
  Created by IntelliJ IDEA.
  User: Jusch
  Date: 07.05.2016
  Time: 11:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Route Overview</title>
</head>
<body>
Show Routes

<jsp:useBean id="routes" class="de.myschnitzel.routeoverview.routeoverviewBean" />
<jsp:getProperty name="routes" property="routes" />

<a href="../index.jsp">zurück</a>
</body>
</html>
