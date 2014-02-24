<%@ page import="java.util.Date" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 14-2-24
  Time: 下午2:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
    当前时间是：
    <%
        Date date = new Date();
    %>
    <%=date%> <!--脚本表达式，它的作用就是像浏览器输出内容 被解析成 out.print(date)-->
    <%
        for(int i=0;i<9;i++){
    %>
        循环内数据
    <%
        }
    %>
    <%--这里是在 _jspService()方法外面写入的java脚本--%>
    <%
        class A{};
    %>
    <%!
        public static void kk(){

        }
        //静态代码块
        static {

        }
        private int num=0;
    %>
    <%!
        static {
            System.out.println("loading Servlet!");
        }
        private int globalVar=0;
        public void initJsp(){
            System.out.println("initializing jsp");
        }
    %>
    <%!
       public void jspDestroy(){
           System.out.println("destory jsp");
       }
    %>


</body>
</html>