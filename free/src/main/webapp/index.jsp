<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 14-2-27
  Time: 下午2:47
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
        欢迎您：${user.nickname}<a href="/">注销</a>
    </c:if>
    <c:if test="${user ==null}">
        <a href="${pageContext.request.contextPath}/user/register/ui">注册</a>
        <a href="${pageContext.request.contextPath}/user/login/ui">登陆</a>
    </c:if>
  </div>
  </body>
</html>
