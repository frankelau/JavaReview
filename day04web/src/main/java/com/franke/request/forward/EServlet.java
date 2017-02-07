package com.franke.request.forward;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class EServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//servlet中不要做 输出正文的动作,没有结果的
		//如果放到前面会出现乱码.
		//但是响应头是可以设置的.
		response.setCharacterEncoding("utf-8");
		response.getWriter().print("哈哈哈,jsp说得对");
		
		
			//1 获得表单提交的用户名密码 
			String name = request.getParameter("name");
			String password = request.getParameter("password");
			
			//2 判断是否正确 tom 1234 才算成功
			
			if(name!=null && name.trim().length()>0 && name.equals("tom")&&
					password!=null && password.trim().length()>0 && password.equals("1234")){
				//成功 ==>  转发到成功页面
				request.getRequestDispatcher("/login/success.jsp").forward(request, response);
				//自己来做,很多弊端,不要这样
			/*	AServlet a = new AServlet();
				a.service(request, response);*/
			}else{
				//失败 ==>  转发到失败页面
				request.getRequestDispatcher("/login/error.jsp").forward(request, response);
			}
			
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			doGet(request, response);
	}

}
