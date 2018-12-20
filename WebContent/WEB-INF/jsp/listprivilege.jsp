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
  
  <<table width="90%">
  <tr>
    <td></td>
    <td></td>
    <td>
    <a href="${pageContext.request.contextPath}/add">添加权限</a>
    </td>
  </tr>
</table>

  
<table width="60%" frame="border" "center" border="1" cellspacing="0">
    <tr>
        <td>id</td>
        <td>name</td>
        <td>操作</td>
    </tr>
    <c:forEach items="${ps}" var="p" varStatus="st">
        <tr>
            <td>${p.id}</td>
            <td>${p.name}</td>
            <td>
	   				<a href="${pageContext.request.contextPath}/update">修改权限</a>
	   				<a href="${pageContext.request.contextPath}/delete">删除权限</a>
	   			</td>   
        </tr>
    </c:forEach>
</table>

</body>
</html>