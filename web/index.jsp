<%--
  Created by IntelliJ IDEA.
  User: Jusch
  Date: 07.05.2016
  Time: 11:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Main Menu</title>
  </head>
  <body>
    <div id="header">##pretty header with logo##</div>
    <div id="menu">
      ## insert nice menue here ##<br>
      <a href="route/routeoverview.jsp">Routeoverview</a><br>
      <a href="highscore/highscore.jsp">Show Highscore</a><br>
      ## exit menu ##<br>
    </div>
    <div id="content">
      ##content##
      Herzlich Willkommen im Hauptmenü!
      <p>    Today's date: <%= (new java.util.Date())%> </p>
      ##exit content##
    </div>
    $END$

  </body>
</html>
