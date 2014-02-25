<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 14-2-25
  Time: 下午4:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>动态包含（运行时包含）</title>
</head>
<body>
    <%
        request.getRequestDispatcher("/public/head.jsp").include(request,response);
    %>
        adsldlkgdlsgkl
    <%
        request.getRequestDispatcher("/public/foot.jsp").include(request,response);
    %>

</body>
</html>