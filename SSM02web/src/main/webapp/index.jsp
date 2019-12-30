<%@ page language="java" import="java.util.*" pageEncoding="utf-8" isELIgnored="false" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  <body>
    	<table border="1" width="100%">
    	<c:forEach items="${list}" var="user" >
    		<tr align="center">
    			<td>${user.id}</td>
    			<td>${user.username}</td>
    			<td>${user.password}</td>
    			<td>
    				<a href="/delete?id=${user.id}">删除</a>
    				<a href="/chaid?id=${user.id}">修改</a>
    			</td>
    		</tr>
    		</c:forEach>
    	</table>
    	<a href="add.jsp">增加</a>
  </body>
</html>
