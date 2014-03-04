<%--
  Created by IntelliJ IDEA.
  User: free
  Date: 14-3-2
  Time: 下午4:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登陆页面</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/user/login/do" method="post">
    用户名：<input type="text" name="username" value="${user.username}" /><br/>
    秘密：<input type="text" name="password" value="${user.password}"/><br/>
    验证码：<input type="text" name="checkcode" /><br/>
    <input type="submit" value="登陆"><input type="button" onclick="location.href='${pageContext.request.contextPath}/user/register/ui'" value="注册"/><br/>
</form>
</body>
</html>
