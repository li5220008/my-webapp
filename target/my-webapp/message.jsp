<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 14-2-20
  Time: 下午5:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" import="java.util.*" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
    <%
        String message= (String)application.getAttribute("message");
        System.out.println(message);
        out.write(message);
    %>
</body>
</html>