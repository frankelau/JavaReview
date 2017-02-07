package com.franke.cookie.hello;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			Cookie cookie = new Cookie("name", "tom");
			
			response.addCookie(cookie);
			
			response.getWriter().print("send cookie successed!");
		
	}

}
