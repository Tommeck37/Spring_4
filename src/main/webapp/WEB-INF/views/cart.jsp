<%--
  Created by IntelliJ IDEA.
  User: tomek
  Date: 30.03.2022
  Time: 13:36
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Cart</title>
</head>
<body>
<h3>Product List</h3>
<title>Multiply</title>
<style>
    table {
        border-collapse: collapse;
    }

    table, th, td {
        border: 1px solid grey;
    }

    th, td {
        text-align: center;
        padding: 6px;
    }

    tr:nth-child(even) {
        background-color: #f2f2f2;
    }
</style>
<c:set var="total" value="0"></c:set>
<table>
    <tr>
        <th>Id</th>
        <th>Quantity</th>
        <th>Name</th>
        <th>Price</th>
        <th>Action</th>
        <th>Action</th>
    </tr><br>
    <c:forEach var="cart" items="${calaLista}">
        <tr>
<%--            <td>${calaLista.quantity}</td>--%>
            <td>${cart.id}</td>
            <td>${cart.quantity}</td>
            <td>${cart.product.name}</td>
            <td>${cart.product.price}</td>
    <td><a href="/removal?id=${cart.id}">usuń</a></td>
    <td><a href="/addone?id=${cart.id}">dodaj_sztukę</a></td>
    <br>

        </tr>
    </c:forEach>
    <tr>
    </tr>
</table>
</body>
</html>
