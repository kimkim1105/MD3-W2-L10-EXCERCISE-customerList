

<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 5/12/2022
  Time: 2:35 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Danh sách khách hàng</title>
</head>
<body>
<%--<form action="/controller.CustomerServlet" method="get">--%>
<center>
    <table style="width: 600px; border: 2px solid navy">
        <tr>
            <th colspan="4"><h1>Danh sách khách hàng</h1></th>
        </tr>
        <tr>
            <td><h3>Tên</h3></td>
            <td><h3>Ngày sinh</h3></td>
            <td><h3>Địa chỉ</h3></td>
            <td><h3>Ảnh</h3></td>
        </tr>
        <c:forEach var="cus" items="${customers}" >
            <tr style="border-bottom: 1px solid lightgray">
                <td>${cus.getName()}</td>
                <td>${cus.getDob()}</td>
                <td>${cus.getAddress()}</td>
                <td><img src="${cus.getLinkimg()}" alt="" width=100 height=100 ></td>
            </tr>
        </c:forEach>
    </table>
</center>
<%--</form>--%>
</body>
</html>

