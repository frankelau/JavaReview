package com.franke.request.param;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			//解决post乱码:
			//因为post请求中,参数的解码时机是在第一次调用getParameter之前,那么我们这要在调用该方法之前设置解码的码表即可.
			//如下就是设置post 参数解码码表
		request.setCharacterEncoding("UTF-8");
		
			String name = request.getParameter("name");
			
			System.out.println(name);
	}

}
