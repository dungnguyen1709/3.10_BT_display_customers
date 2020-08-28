
<%--
  Created by IntelliJ IDEA.
  User: LapTop
  Date: 8/27/2020
  Time: 10:17 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <style>
        .container td {
            vertical-align: middle;
        }
    </style>
</head>
<body>
<h1 style="text-align: center">Danh sách khách hàng</h1>
<div class="container">
    <table class="table-responsive" >
        <table class="table table-hover">
            <tr>
                <th>Tên</th>
                <th>Ngày Sinh</th>
                <th>Địa Chỉ</th>
                <th>Khung Ảnh</th>
            </tr>
            <c:forEach items="${listCustomers}" var="customer">
                <tr>
<%--                  <td><c:out value="${customer.getName()}"></c:out></td>  --%>
<%--                    <td><c:out value="${customer.getDateOfBirth()}"></c:out></td>--%>
<%--                    <td><c:out value="${customer.getAddress()}"></c:out></td>--%>
<%--                    <td><c:out value="${customer.getImage()}"></c:out></td>--%>
                    <td>${customer.name}</td>
                    <td>${customer.dateOfBirth}</td>
                    <td>${customer.address}</td>
    <td><img src="${customer.image}"  width="100px" height="100px"></td>
                </tr>
            </c:forEach>
        </table>
    </table>
</div>

</body>
</html>
