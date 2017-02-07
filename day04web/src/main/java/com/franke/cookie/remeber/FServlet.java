package com.franke.cookie.remeber;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FServlet extends HttpServlet {

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

			//1 获得用户名
		String name= request.getParameter("name");
		String remeber = request.getParameter("remeber");
			//新建cookie
		Cookie cookie = new Cookie("remeber",name);
			//2判断remeber .
		if(remeber!=null && remeber.equals("yes")){
			// "yes" 勾选了 ==>  设置有效时间为 一周
			cookie.setMaxAge(60*60*24*7);
		}else{
			// null 没勾选 ==>  设置cookie的有效时间为0
			cookie.setMaxAge(0);
		}
			//3 将cookie添加到response
		response.addCookie(cookie);
			//4 跳转到成功页面
		request.getRequestDispatcher("/index.jsp").forward(request, response);
	}

}
