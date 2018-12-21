<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*"%>
  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<html>
 <head>
    <title>添加角色界面</title>
  </head>
<body>

  <form action="addRole">
     <table>
         <tr>
                   <td>角色名称</td>
                    <td>
                         <input text="text" name="name">
                    </td>
         </tr>
         
         <tr>
                  <td>角色描述</td>
                  <td>
                         
                         <textarea rows="5" cols="50" name="description"></textarea>
                  </td>
         </tr>
         
         <tr>
                 <td>授权</td>
                 <td>
                        <c:forEach items="${privileges}" var="privilege">
                         <input type="checkbox" name="privilegeIds" value="${privilege.id}"/>
                         ${privilege.name}
                        </c:forEach>
                  </td>
         </tr>
         
         <tr>
                 <td></td>
                 <td>
                      <input type="submit" value="添加角色">
                 </td>
         </tr>
         
     </table>
  
  </form>

</body>
</html>