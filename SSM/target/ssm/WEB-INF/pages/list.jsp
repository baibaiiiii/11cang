<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2020/8/22
  Time: 16:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>标题</title>
</head>
<body>
   <h3>查询所有账户信息</h3>

   <table border="1"width="300px">
       <tr>
           <th>编号</th>
           <th>账户名称</th>
           <th>账户金额</th>
           <th>操作</th>
           <th>操作</th>
       </tr>
       <c:forEach items="${list}" var="account" varStatus="vs">
       <tr>
           <td>${vs.count}</td>
           <td>${account.name}</td>
           <td>${account.money}</td>
           <td><a href="${pageContext.request.contextPath}/account/deleteAccount?id=${account.id}">删除</a></td>
           <td><a href="${pageContext.request.contextPath}/account/updateAccount?flag=0&id=${account.id}">修改</a></td>
       </tr>
       </c:forEach>
   </table>
</body>
</html>
