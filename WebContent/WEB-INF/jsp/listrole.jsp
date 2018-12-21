<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*"%>
  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
 <html> 
  <head>
    <title>角色列表</title>
  </head>
  
  <body style="text-align: center;">
   	<br/>	<br/>
  
  <table width="90%">
  <tr>
    <td></td>
    <td></td>
    <td>
    <a href="${pageContext.request.contextPath}/addRolePage">添加角色</a>
    </td>
  </tr>
</table>

  
<table width="60%" frame="border" "center" border="1" cellspacing="0">
    <tr>
        <td>角色名称</td>
        <td>角色描述</td>
        <td>角色对应权限</td>
        <td>操作</td>
    </tr>
    <c:forEach items="${rs}" var="r" varStatus="st">
        <tr>
            <td>${r.name}</td>
            <td>${r.description}</td>
            
            <td>
                 <c:forEach items="${r.privileges}" var="privileges">
                 ${privileges.name}
                 </c:forEach>
            </td>
            
            <td>
	   				<a href="${pageContext.request.contextPath}/updaterole?id=${r.id}">修改角色</a>
	   				<a href="${pageContext.request.contextPath}/deleterole?id=${r.id}">删除角色</a>
	   			</td>   
        </tr>
    </c:forEach>
</table>

</body>
</html>