package com.franke.response.demo2;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			//重定向
			/*
			 //1 返回状态码为302
				response.setStatus(302);
			//2 告诉浏览器去哪找新的地址  发送一个响应头: Location : http://www.baidu.com
				//response.setHeader("Location", "http://www.baidu.com");
				response.setHeader("Location", "/day04web/AServlet");
				*/
			//-----------------------------------------------------------------
			response.sendRedirect("/day04web/AServlet");
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
