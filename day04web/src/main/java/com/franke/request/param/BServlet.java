package com.franke.request.param;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BServlet extends HttpServlet {

	private static final long serialVersionUID = 7942424265195308974L;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			//获得表单提交上来的键值对
			String name = request.getParameter("name");
			String age = request.getParameter("age");
			System.out.println(name+"==>"+age);
			//解决乱码
			
			byte[] nameByte = name.getBytes("ISO-8859-1");
			
			String newName = new String(nameByte,"UTF-8");
			
			System.out.println("解决之后的:"+newName);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
