<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 14-3-5
  Time: 下午1:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>书列表</title>
    <style type="text/css">
        .table{
            width: 70%;
            text-align:center;
            border : 2px solid #000;
            table-layout : fixed;
        }
    </style>
</head>
<body>
    <h1>书籍列表</h1>
    <table class="table">
        <tr>
            <th>书名</th>
            <th>作者</th>
            <th>售价</th>
            <th>描述</th>
            <th>操作</th>
        </tr>
        <c:forEach var="entry" items="${map}">
            <tr>
                <td>${entry.value.name}</td>
                <td>${entry.value.author}</td>
                <td>${entry.value.price}</td>
                <td>${entry.value.description}</td>
                <td><a href="${pageContext.request.contextPath}/book/buy?id=${entry.value.id}" target="_blank">购买</a><a>删除</a></td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>