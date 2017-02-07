package com.franke.cookie.time;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DServlet extends HttpServlet {

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Cookie cookie  = new Cookie("age", "18");
		//设置cookie的最大有效时间
		//cookie.setMaxAge(60*60);
		//设置为-1 , 就是相当于默认有效时间, 浏览器关闭就消失.
		//cookie.setMaxAge(-1);
		// 标示cookie的有效时间为0.发送到浏览器就消失了.
		//利用有效时间为0 这件事,我们可以做删除cookie的操作.
		// 因为同一个路径 ,不能存在相同的cookie(键相同).
		// 我们可以通过覆盖的方式,设置有效时间为0. 删除cookie
		//cookie.setMaxAge(0);
		
		response.addCookie(cookie);
		
	}

}
