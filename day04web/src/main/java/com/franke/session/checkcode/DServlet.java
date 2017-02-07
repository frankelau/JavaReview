package com.franke.session.checkcode;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DServlet extends HttpServlet {

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
			//1 获得表单提交的验证码
			String code1 = request.getParameter("code");
			//2 获得session中的正确验证码
			String code2 = 	(String) request.getSession().getAttribute("code");
			//3 比对是否一致
			if(code1!=null && code2!=null && code1.equals(code2)){
				//正确==> 成功页面
				response.sendRedirect("/Day09-session/index.jsp");
			}else{	
				//不正确==> 回到表单 页面 ,提示错误
				request.setAttribute("error", "验证码错误!请重新输入");
				request.getRequestDispatcher("/checkcode/login.jsp").forward(request, response);
			}
	}

}
