<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 14-2-26
  Time: 下午2:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>计算器</title>
</head>
<style>
    body{
        margin: 0px;
        padding: 0px;
        text-align:center;
        overflow: hidden;
        text-align: center;
    }
    #container{
        margin: 0px auto;
        width: 980px;
        height: auto;
    }
    .head{
        width: 100%;
        background: blue;
    }
    .formdiv{
        margin: 0px auto;
        background: yellow;
        width:50%;
        text-align: center;
    }
    .form{
        margin: 0px auto;
        width:100%;
    }
</style>
<body style="text-align: center">
    <div id="container">
    <div class="head">
        <br/>-----------------------------------------<br/>
        <jsp:useBean id="caculatorBean" class="dao.Caculator"/>
        <jsp:setProperty name="caculatorBean" property="*"/>
        <%
            caculatorBean.caculate();
        %>
        <jsp:getProperty name="caculatorBean" property="param1"/>
        +
        <jsp:getProperty name="caculatorBean" property="param2"/>
        =
        <jsp:getProperty name="caculatorBean" property="result"/>
        <br/>-----------------------------------------<br/>
    </div>
        <div class="formdiv">
            <form action="/jsp/caculator.jsp" method="post" class="form" >
                <table style="border: 2px;">
                    <tr>
                        <td>简单的计算器</td>
                        <td></td>
                    </tr>
                    <tr>
                        <td>第一个参数</td>
                        <td><input type="text" name="param1"></td>
                    </tr>
                    <tr>
                        <td>运算符</td>
                        <td>
                            <select name="operator">
                                <option value="+">+</option>
                                <option value="-">-</option>
                                <option value="*">*</option>
                                <option value="/">/</option>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <td>第二个参数</td>
                        <td><input type="text" name="param2"></td>
                    </tr>
                    <tr>
                        <td colspan="2"><input type="submit" value="提交"></td>
                    </tr>
                </table>
            </form>
        </div>
    </div>
</body>
</html>