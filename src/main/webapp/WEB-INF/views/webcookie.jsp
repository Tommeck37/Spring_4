<%--
  Created by IntelliJ IDEA.
  User: tomek
  Date: 31.03.2022
  Time: 10:16
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:forEach var="ciacho" items="${ciastka}">
    <tr>
        <td>${ciacho.name}</td>
        <td>${ciacho.value}</td>
        <br>
        </c:forEach>
</body>
</html>
