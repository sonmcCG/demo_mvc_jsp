<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 26/11/2020
  Time: 10:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="/product/list.jsp">Product</a>
    <form action="user" method="post">
        <input type="text" hidden name="uname"/>
        <input type="password" name="pw"/>
        <button type="submit">Login</button>
    </form>
</body>
</html>
