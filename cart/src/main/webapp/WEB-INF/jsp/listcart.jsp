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
    <script type="text/javascript">
        function deleteConfirm(id){
            var confirm = window.confirm("您确定删除吗？");
            if(confirm){
                window.location.href="${pageContext.request.contextPath}/book/delete?id="+id;
            }
        }
        function clearCart(id){
            var confirm = window.confirm("确定要清空购物车吗？");
            if(confirm){
                window.location.href="${pageContext.request.contextPath}/book/clear";
            }
        }
    </script>
    <title>购物车</title>
</head>
<body>
<h1>购物车列表</h1>
<c:if test="${empty(cart.map)}">
    <tr><td>您没有购买任何商品！</td></tr>
</c:if>
<c:if test="${!empty(cart.map)}">
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
            <td><a  href="javascript:void(0);" onclick="deleteConfirm(${entry.value.book.id})"> 删除</a></td> <%--去掉超链接的默认行为--%>
        </tr>
    </c:forEach>
        <tr>
            <td colspan="3">总价</td>
            <td colspan="2">${cart.price}</td>
            <td colspan="1"><a href="javascript:void(0);" onclick="clearCart()">清空购物车</a></td>
        </tr>
</table>
</c:if>
</body>
</html>