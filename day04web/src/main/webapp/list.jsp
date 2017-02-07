<%@page import="com.franke.bean.User"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

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
		<%
			//相当于servlet中的代码
			List<User> list = new ArrayList<User>();
			list.add(new User("tom","male"));
			list.add(new User("jerry","female"));
			list.add(new User("jack","male"));
			request.setAttribute("list", list);
		%>
		
		
		<%
			List<User> list2 = (List<User>)request.getAttribute("list");
			
		%>
		
		<table border="1" >
			<tr><th>姓名</th><th>性别</th></tr>
			<%
				for(User u : list2){
					%>
			<tr><td><%=u.getName() %></td><td><%=u.getSex() %></td></tr>
					<% 
				}
			%>
			
		</table>
		
		
		
		
		
		
		
		    
  </body>
</html>
