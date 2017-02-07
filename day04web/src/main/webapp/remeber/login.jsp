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
  
  	<%
  		//1 获得浏览器发送 过来的cookie
			Cookie[] cookies = request.getCookies();
  		//2 遍历找到保存用户名的
  		Cookie remeber = null;
  				if(cookies!=null && cookies.length>0){
  					for(Cookie c: cookies){
  						if(c.getName().equals("remeber")){
  							remeber = c;
  						}
  					}
  				}
  		//3 如果找到取得它的值
  		//4把值设置到 用户名所在input
  	
  	 %>
  
  <body>
   <form action="/day04web/F2Servlet"  method="post"  >
  用户名:	<input type="text" name="name"  value="<%=remeber==null?"":remeber.getValue() %>" /><br>
   密码:	<input type="password" name="password" /><br>
  记住用户名(一周): 	<input type="checkbox" name="remeber" value="yes" <%=remeber==null?"":"checked" %> /><br>
   	<input  type="submit" value="登录" /> <br>
   </form>
  </body>
</html>
