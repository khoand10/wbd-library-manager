<%--
  Created by IntelliJ IDEA.
  User: dangkhoa
  Date: 14/05/2018
  Time: 09:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <title>Book Manager</title>
  </head>
  <body>
  <form>
    Id<input type="text" name="id"><br>
    Code<input type="text" name="code"><br>
    Title<input type="text" name="title"><br>
    Year<input type="text" name="year"><br>
    Price<input type="text" name="year"><br>
    Images<input type="text" name="images"><br>

    Category<select name="category">
    <c:forEach items="${categories}" var="category">
    <option ${category.getId()}>${category.getName()}</option>
    </c:forEach>
  </select><br>

      Author<select name="author">
      <c:forEach items="${authors}" var="author">
        <option ${author.getId()}>${author.getName()}</option>
      </c:forEach>
    </select><br>

        Publisher<select name="publisher">
        <c:forEach items="${publishers}" var="publisher">
          <option ${publisher.getId()}>${publisher.getName()}</option>
        </c:forEach>
      </select><br>
        <button>send</button>
  </form>
    <table border="1">
      <tr>
        <th>Id</th>
        <th>Code</th>
        <th>Title</th>
        <th>Year</th>
        <th>Price</th>
        <th>Image</th>
        <th>Category</th>
        <th>Author</th>
        <th>Publisher</th>
        <th>Edit</th>
        <th>Delete</th>
      </tr>
      <c:forEach items="${list}" var="book">
        <tr>
          <td>${book.getId()}</td>
          <td>${book.getCode()}</td>
          <td><a href="/book?action=info?id=${book.getId()}">${book.getTitle()}</a></td>
          <td>${book.getYear()}</td>
          <td>${book.getPrice()}$</td>
          <td>${book.getImages()}</td>
          <td>${book.getCategory().getName()}</td>
          <td>${book.getAuthor().getName()}</td>
          <td>${book.getPublisher().getName()}</td>
          <td><a href="/book?action=edit&id=${book.getId()}">Edit</a></td>
          <td><a href="/book?action=delete&id=${book.getId()}">Edit</a></td>
        </tr>
      </c:forEach>
    </table>
    <br><a href="/categories">Show categories</a>
  </body>
</html>
