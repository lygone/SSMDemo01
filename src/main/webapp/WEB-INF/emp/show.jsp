<%--
  Created by IntelliJ IDEA.
  User: panyi
  Date: 2018/2/17
  Time: 20:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<center><table border="1">
    <tr>
        <th>部门编号</th>
        <th>部门名称</th>
    </tr>
    <c:forEach items="${depts}" var="dept">
    <tr>
        <td>${dept.deptId}</td>
        <td>${dept.deptName}</td>
    </tr>
    </c:forEach>
</table>
</center>

</body>
</html>
