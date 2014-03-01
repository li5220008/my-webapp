<%@ page import="java.util.Date" %>
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
    <%=person.getAge()%><br/>
    <jsp:setProperty name="person" property="age" param="age"/><%--支持8种基本数据类型转换(把客户机提交的字符转换成相应的类型)--%>
    <%=person.getAge()%><br/>
    <jsp:setProperty name="person" property="birthday" value="<%=new Date()%>"/>  <%--这里这样转换日期--%>
    <%=person.getBirthday()%><br/>
    <br/>--------------------------------------<br/>
    <jsp:setProperty name="person" property="*"/>
    <%--<%=person.getAge()%><br/>
    <%=person.getName()%><br/>
    <%=person.getBirthday()%><br/>--%>
    <jsp:getProperty name="person" property="age"/><br/>
    <jsp:getProperty name="person" property="name"/><br/>
    <jsp:getProperty name="person" property="birthday"/><br/>
</body>
</html>