<%@page import="java.util.Map.Entry"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'login.jsp' starting page</title>
    
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
  <h1>用户登录</h1>
 		<form action="/day04web/HServlet" method="POST">
 			用户名:<input type="text" name="name" /> <br>
 			密码:<input type="password" name="password" /><br>
 			<input type="submit" >
 		</form>
 		<%
 			Map<String,String> error = (Map<String,String>)request.getAttribute("error");
 			
 			if(error!=null && error.size()>0){
 				for(Entry<String,String> en : error.entrySet()){
 					out.print("<font color='red'>");
 					out.print(en.getValue()+"<br>");
 					out.print("</font>");
 				}
 			}
 		
 		%>
  </body>
</html>
