<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'list.jsp' starting page</title>
    
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
  		<a href="<%=request.getContextPath() %>/C2Servlet?name=dell" >dell</a> <br>
  		<a href="<%=request.getContextPath() %>/C2Servlet?name=lenovo" >lenovo</a><br>
  		<a href="<%=request.getContextPath() %>/C2Servlet?name=apple" >apple</a><br>
  		<a href="<%=request.getContextPath() %>/C2Servlet?name=acer" >acer</a><br>
  		<a href="<%=request.getContextPath() %>/C2Servlet?name=hasee" >hasee</a><br>
  		浏览历史:
  			<%=request.getAttribute("history") %>
  	
  </body>
</html>
