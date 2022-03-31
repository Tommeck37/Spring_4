<%--
  Created by IntelliJ IDEA.
  User: tomek
  Date: 30.03.2022
  Time: 10:16
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/addedtocart" method="post">
    Podaj wartości Produktu <br>
    <input type="text" name="id" /> id <br>
    <input type="text" name="quantity"/>ilość<br>
    <input type="text" name="name" /> produkt<br>
    <input type="number" name="price" /> cena<br>

    <input type="submit" value="Wyślij">
</form>
</body>
</html>
