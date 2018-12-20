<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*"%>
  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<html>
 <head>
    <title>权限列表</title>
  </head>
<body>

  <form action="updateprivilege">
     <table>
         <tr>
                   <td>权限名称</td>
                    <td>
                         <input text="text" name="name">
                    </td>
         </tr>
         
         <tr>
                  <td>权限描述</td>
                  <td>
                         
                         <textarea rows="5" cols="50" name="description"></textarea>
                  </td>
         </tr>
         
         <tr>
                 <td>权限uri</td>
                 <td>
                         <input text="text" name="uri">
                  </td>
         </tr>
         
         <tr>
                 <td></td>
                 <td>
                      <input type="submit" value="添加权限">
                 </td>
         </tr>
         
     </table>
  
  </form>

</body>
</html>