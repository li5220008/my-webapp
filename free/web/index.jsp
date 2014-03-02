<%--
  Created by IntelliJ IDEA.
  User: free
  Date: 14-3-1
  Time: 下午4:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <title>网站首页</title>
  </head>
  <body>
  <div style="text-align: right;">
    <c:if test="${user !=null}">
        欢迎您：${user.name}<a href="/">注销</a>
    </c:if>
    <c:if test="${user ==null}">
        <a href="">注册</a>
        <a href="${pageContext.request.contextPath}/user/loginUIServlet">登陆</a>
    </c:if>
  </div>
  </body>
</html>
