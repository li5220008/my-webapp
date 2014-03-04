<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 14-2-28
  Time: 下午5:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
    <script type="text/javascript">
        function changeImg(img){
            img.src=img.src+'?'+new Date().getTime()
        }
    </script>
    <style type="text/css">
        .error{
            color: red;
        }
    </style>
</head>

<body>
<form action="${pageContext.request.contextPath}/user/register/do" method="post">
    点击：<a href="/post/do?username=xiaoming?password=wangwu">get</a><br/>
    <div class="message">${message}</div>
    用户名：<input type="text" name="username" value="${form.username}"/> <span class="error">${form.errors.username}</span><br/>
    昵称：<input type="text" name="nickname" value="${form.nickname}"/> <span class="error">${form.errors.nickname}</span><br/>
    密码：<input type="password" name="password" value="${form.password}"/> <span class="error">${form.errors.password}</span><br/>
    重复密码：<input type="password" name="repassword" value="${form.repassword}"/> <span class="error">${form.errors.repassword}</span><br/>
    生日：<input type="text" name="birthday" value="${form.birthday}" /> <span class="error">${form.errors.birthday}</span><br/>
    邮箱：<input type="text" name="email" value="${form.email}" /> <span class="error">${form.errors.email}</span><br/>
    认证码：<input type="text" name="checkcode" value="${form.checkcode}"/><span class="error">${form.errors.checkcode}</span>
    <img src="/random/img" alt="点击刷新" style="cursor: pointer" onclick="changeImg(this)"><br/>
    <input type="submit"  value="注册"/>
</form>
</body>
</html>