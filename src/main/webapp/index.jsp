<%@ page language="java" contentType="text/html;
charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<html>
<body>
<h2>Hello World!</h2>
<a href="/emp/add">添加员工</a>
<a href="/emp/show">显示所有部门</a>
<a href="/emp/selectByDeptId">根据部门编号来查询部门下的所有用户</a>
<form action="/emp/selectByDeptId" method="post">
   部门编号： <input type="text" name="deptId">
    <input type="submit" value="查询">
</form>
</body>
</html>
