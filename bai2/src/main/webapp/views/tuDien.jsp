<%--
  Created by IntelliJ IDEA.
  User: tiepd
  Date: 09/12/2022
  Time: 11:53 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
<title>Dictionary</title>
</head>
<body>
<h1 style="box-shadow: blueviolet">Bạn hãy nhập những từ mà tôi có vào đây tôi sẽ dịch cho bạn sang tiếng vietnamese</h1>
<form action="<%=request.getContextPath()%>/tuDienAnhVietController/tuDien123" method="post">
    <input type="text" name="tudich">
    <input type="submit" >
</form>
<h1 style="color: darkmagenta">${ra}</h1>
</body>
</html>

