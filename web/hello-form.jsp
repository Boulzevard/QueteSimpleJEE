<%--
  Created by IntelliJ IDEA.
  User: wilder
  Date: 28/05/18
  Time: 11:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Ma requete</title>
</head>
<body>
<form action="/custom-hello" method="post">
    First name:<br>
    <input type="text" name="firstname"><br>
    Last name:<br>
    <input type="text" name="lastname"><br>
    L'heure c'est important : <br>
    <input type="text" name="heure"><br>
    <input type="submit" value="Submit">
</form>
</body>
</html>
