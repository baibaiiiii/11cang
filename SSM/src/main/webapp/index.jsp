<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2020/8/22
  Time: 16:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>标题</title>
</head>
<body>
   <a href="account/findAll">测试</a>


   <form action="account/saveAccount" method="post">
       账户名称：<input type="text" name="name"/><br/>
       账户金额：<input type="text" name="money"><br/>
       <input type="submit" value="保存"/>
   </form>

</body>
</html>