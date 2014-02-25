<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 14-2-25
  Time: 下午5:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>pagecontext访问其他域</title>
</head>
<body>
    <%
        request.setAttribute("data","aaa");
        String data = (String)pageContext.getAttribute("data",PageContext.REQUEST_SCOPE);
        out.write(data);
    %>
    <%--下面相当于${data}el表达式--%>
    <%
        pageContext.findAttribute("data");//page request session application
    %>
</body>
</html>