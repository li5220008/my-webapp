<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 14-2-26
  Time: 上午8:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
    <jsp:useBean id="person" class="dao.Person" scope="page">
        bean实例化时候会输出这些内容！<br/>
    </jsp:useBean>
    <%--给bean手工赋值--%>
    <%=person.getName()%><br/>
    <jsp:setProperty name="person" property="age" value="120"/>
    <%=person.getAge()%>
    <jsp:setProperty name="person" property="age" param="age"/>
    <%=person.getAge()%>
</body>
</html>