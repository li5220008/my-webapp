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
</head>

<body>
<form action="/post/do" method="post">
    点击：<a href="/post/do?username=xiaoming?password=wangwu">get</a><br/>
    用户名：<input type="text" name="username"/><br/>
    绰号：<input type="text" name="nickname"/><br/>
    密码：<input type="password" name="password"/><br/>
    生日：<input type="text" name="birthday"/><br/>
    邮箱：<input type="text" name="email"/><br/>
    认证码：<input type="text" name="checkcode"/>
    <img src="/random/img" alt="点击刷新" style="cursor: pointer" onclick="changeImg(this)"><br/>
    <input type="submit" value="注册"/>
</form>
</body>
</html>