<%--
  Created by IntelliJ IDEA.
  User: dangkhoa
  Date: 14/05/2018
  Time: 20:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Category</title>
</head>
<body>
<table border="1">
    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Edit</th>
        <th>Delete</th>
    </tr>
    <c:forEach items="${list_category}" var="category">
        <tr>
            <td>${category.getId()}</td>
            <td>${category.getName()}</td>
            <td><a href="">Edit</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
