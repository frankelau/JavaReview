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
    		
    		<table border="1" align="center" >
    			<tr>
    				<td><h3>肥皂</h3><img src="/Day09-session/car/img/img (1).jpg" width="300" height="200" /><br><a href="/Day09-session/BServlet?name=0" >加入购物车</a></td>
    				<td><h3>电动车</h3><img src="/Day09-session/car/img/img (2).jpg" width="300" height="200" /><br><a href="/Day09-session/BServlet?name=1" >加入购物车</a></td>
    			</tr>
    			<tr>
    				<td><h3>笔记本</h3><img src="/Day09-session/car/img/img (3).jpg" width="300" height="200" /><br><a href="/Day09-session/BServlet?name=2" >加入购物车</a></td>
    				<td><h3>小雨伞</h3><img src="/Day09-session/car/img/img (4).jpg" width="300" height="200" /><br><a href="/Day09-session/BServlet?name=3" >加入购物车</a></td>
    			</tr>
    			<tr>
    				<td><h3>八度空间</h3><img src="/Day09-session/car/img/img (5).jpg" width="300" height="200" /><br><a href="/Day09-session/BServlet?name=4" >加入购物车</a></td>
    				<td><h3>床单</h3><img src="/Day09-session/car/img/img (6).jpg" width="300" height="200" /><br><a href="/Day09-session/BServlet?name=5" >加入购物车</a></td>
    			</tr>
    		
    		</table>
    	<a href="/Day09-session/car/car.jsp" >查看购物车</a>
	
  </body>
</html>
