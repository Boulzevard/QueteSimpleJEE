<%@ page import="java.io.PrintWriter" %><%--
  Created by IntelliJ IDEA.
  User: wilder
  Date: 28/05/18
  Time: 15:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>mon custom</title>
</head>
<body>
    <%
    String message  = (String) request.getAttribute("monmessage");
    out.print(message);

    %>

</body>
</html>
