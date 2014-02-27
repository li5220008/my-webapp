<%@ page import="dao.Person" %>
<%@ page import="dao.Address" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 14-2-27
  Time: 上午8:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<html>
<head>
    <title>el表达式和jstl标签入门</title>
</head>
<body>
    <%
        String data = "abc";
        request.setAttribute("data",data);
    %>
    输出数据：${data}<br/> <%--pageContext.findAttribute("data") page request session application--%>
    <%
        Person person = new Person();
        person.setName("zhangsan");
        Address ad =  new Address();
        ad.setCity("深圳");
        person.setAddress(ad);
        request.setAttribute("person",person);
    %>
    输出对象：${person.name}<br/> <%--pageContext.findAttribute("data") page request session application--%>
    输出对象属性：${person.address.city}<br/>
    <%
        List list = new ArrayList();
        list.add(new Person("张三"));
        list.add(new Person("李四"));
        list.add(new Person("王五"));
        request.setAttribute("list",list);
    %>
    取出集合里面的数据${list[1].name}<br/>
    <%
        Map map = new HashMap();
        map.put("a",new Person("AAA"));
        map.put("b",new Person("BBB"));
        map.put("c",new Person("CCC"));
        map.put("d", new Person("DDD"));
        map.put("111", new Person("EEE"));
        request.setAttribute("map",map);
    %>
    输出map:
    ${map.a.name}<br/>
    ${map.b.name}<br/>
    ${map.c.name}<br/>
    ${map.d.name}<br/>
    ${map['111'].name}<br/><%--用el表达式在数据时，常用.号，取不出时，再用[]--%>

<c:forEach items="${list}" var="person1">
    ${person1.name}
</c:forEach>
<c:forEach var="entry" items="${map}">
    ${entry.key} : ${entry.value.name}
</c:forEach>
</body>
</html>