<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--
  Created by IntelliJ IDEA.
  User: tiepd
  Date: 09/12/2022
  Time: 9:46 SA
  To change this template use File | Settings | File Templates.
--%>
<html>
<head>
    <title>Hello</title>
</head>
<body>

<form action="<%=request.getContextPath()%>/quyDoiTienController/tiente" method="get" >
    <h1 style="color: blue">Đây là bảng quy đổi tiền $;</h1>
    <select name="tiendoi" id="">
        <option value="${vnd}" name="vnd">VND</option>
        <option value="${usd}" name="usd">USD</option>
    </select>
    <input type="text" name="usd" placeholder="USD" >
    <input type="text" name="vnd" placeholder="VND" value="">
    <h1 style="border: maroon">${vnd}</h1>
    <h1>${usd}</h1>
    <input type="submit" value="Đổi Tiền">
</form>
</body>
</html>

