<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*"%>
  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
 <html> 
  <head>
    <title>权限列表</title>
  </head>
  
  <body style="text-align: center;">
   	<br/>	<br/>
  
  <table width="90%">
  <tr>
    <td></td>
    <td></td>
    <td>
    <a href="${pageContext.request.contextPath}/addPrivilegePage">添加权限</a>
    </td>
  </tr>
</table>

  
<table width="60%" frame="border" "center" border="1" cellspacing="0">
    <tr>
        <td>权限名称</td>
        <td>权限描述</td>
        <td>操作</td>
    </tr>
    <c:forEach items="${ps}" var="p" varStatus="st">
        <tr>
            <td>${p.name}</td>
            <td>${p.description}</td>
            <td>
	   				<a href="${pageContext.request.contextPath}/updatePrivilegePage?id=${p.id}">修改权限</a>
	   				<a href="${pageContext.request.contextPath}/deleteprivilege?id=${p.id}">删除权限</a>
	   			</td>   
        </tr>
    </c:forEach>
</table>

</body>
</html>