<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*"%>
  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<html>
 <head>
    <title>添加角色界面</title>
  </head>
<body>

  <form action="addrole">
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
                 <td>角色对应的权限</td>
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