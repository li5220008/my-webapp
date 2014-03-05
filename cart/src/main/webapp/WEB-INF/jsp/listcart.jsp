<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 14-3-5
  Time: 下午6:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <style type="text/css">
        .table{
            width: 70%;
            text-align:center;
            border : 2px solid #000;
            table-layout : fixed;
        }
    </style>
    <title>购物车</title>
</head>
<body>
<h1>购物车列表</h1>
<table class="table">
    <tr>
        <th>书名</th>
        <th>作者</th>
        <th>单价</th>
        <th>数量</th>
        <th>小计</th>
        <th>操作</th>
    </tr>
    <c:forEach var="entry" items="${cart.map}">
        <tr>
            <td>${entry.value.book.name}</td>
            <td>${entry.value.book.author}</td>
            <td>${entry.value.book.price}</td>
            <td>${entry.value.quantity}</td>
            <td>${entry.value.price}</td>
            <td><a href="">删除</a></td>
        </tr>
    </c:forEach>
        <tr>
            <td colspan="3">总价</td>
            <td colspan="3">${cart.price}</td>
        </tr>
</table>
</body>
</html>