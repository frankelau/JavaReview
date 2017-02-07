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
	<script type="text/javascript">
		function fun1(){
			//1  获得img对象
			var img = 	document.getElementById("one");
			//2 改变img对象 src属性
				img.src = "/Day09-session/EServlet?abc="+new Date();
			
		}
		
	</script>

  </head>
  
  
  <body>
   <form action="/Day09-session/DServlet"  method="post"  >
  用户名:	<input type="text" name="name"  /><br>
   密码:	<input type="password" name="password" /><br>
  验证码: 	<input type="text" name="code"   /><img src="/Day09-session/EServlet" width="150" id="one" onclick="fun1();" />
  			<a href="javaScript:void(0)"  onclick="fun1();"  >看不清换一张</a><br>
   	<input  type="submit" value="登录" /> <br>
   </form>
   <font color="red">
   	<%=request.getAttribute("error")==null?"":request.getAttribute("error") %>
   </font>
  </body>
</html>
