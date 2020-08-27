<%--
  Created by IntelliJ IDEA.
  User: MSI
  Date: 2020/8/23
  Time: 18:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  isELIgnored="false"%>
<html>
<head>
    <title>修改</title>
</head>
<body>
    <form action="updateAccount" method="get">
        账户id：<input type="text" name="id" readonly="readonly" value="${account.id}"><br/>
        账户名称：<input type="text" name="name" value="${account.name}"><br/>
        账户金额：<input type="text" name="money" value="${account.money}"><br/>
        <input type="hidden" name="flag" value="1">
        <input type="submit" value="保存"/>
    </form>
</body>
</html>
