<%--
  Created by IntelliJ IDEA.
  User: Jusch
  Date: 07.05.2016
  Time: 11:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Highscores</title>
</head>
<body>
show highscore
<jsp:useBean id="highscore" class="de.myschnitzel.highscore.highscoreBean" />
<jsp:getProperty name="highscore" property="highscore"/>
<a href="../index.jsp">zurück</a>
</body>
</html>
