<%--
  Created by IntelliJ IDEA.
  User: panyi
  Date: 2018/2/17
  Time: 16:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> >
<html>
<head>
    <title>Title</title>
</head>
<body>
<center>
    <form action="/emp/add" method="post"><br>
       empId: <input type="text" name="empId"><br>
        empName:<input type="text" name="empName"><br>
        gender:<input type="radio" name="gender" value="true">男
        <input type="radio" name="gender" value="false">女<br>
        hireDate:<input type="text" name="hireDate"><br>
        salary:<input type="text" name="salary"><br>
        请选择部门：
        <select name="dept.deptId">
            <c:forEach items="${depts}" var="dept">
            <option value="${dept.deptId}">${dept.deptName}</option>
            </c:forEach>
        </select>
        <input type="submit" value="add employee">
    </form>
</center>
</body>
</html>
