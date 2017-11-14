<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
  </head>
  
  <body>
   <center>
   <table border="1">
   <tr>
   <th colspan="6"><h3>空气质量检测信息库</h3></th>
   </tr>
   <tr>
   <th align="right" colspan="6"><a href="add">添加空气质量信息</a></th>
   </tr>
   <tr>
   <th>序号</th>
    <th>区域</th>
     <th>监测时间</th>
     
      <th>PM10数据</th>
       <th>PM2.5数据</th>
        <th>监测站</th>
       
   </tr>
   <c:forEach items="${all }" var="A">
   <tr>
   <td>${A.id }</td>
   <td>${A.name }</td>
   <td>${A.monitor }</td>
   <td>${A.pm10 }</td>
   <td>${A.pm25 }</td>
   <td>${A.monitoring }</td>
   </tr>
   </c:forEach>
   </table>
    <a href="getAll?indexpage=1">首页</a>
   <a href="getAll?indexpage=${indexpage-1 }">上一页</a>
    
   <c:choose>
   <c:when test="${indexpage ge zongnum }">
   <a href="getAll?indexpage=${zongnum }">下一页</a>
   </c:when>
   <c:otherwise>
    <a href="getAll?indexpage=${indexpage+1 }">下一页</a>
   </c:otherwise>
   </c:choose>
     <a href="getAll?indexpage=${zongnum }">末页</a>
   </center>
  </body>
</html>
