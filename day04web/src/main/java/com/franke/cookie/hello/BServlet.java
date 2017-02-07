package com.franke.cookie.hello;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			
		Cookie[] cookies  = request.getCookies();
		
		if(cookies!=null && cookies.length>0){
			for(Cookie c : cookies){
					if(c.getName().equals("name")){
						System.out.println("获得的cookie:"+c.getName()+":"+c.getValue());
					}
			}
		}
		
	}

}
