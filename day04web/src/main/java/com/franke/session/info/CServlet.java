package com.franke.session.info;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class CServlet extends HttpServlet {

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
		/*long getCreationTime()  
		String getId()  
		long getLastAccessedTime()  
		int  getMaxInactiveInterval() 
		void setMaxInactiveInterval(int interval)  
		void invalidate()  
		boolean isNew()  */
		HttpSession session = request.getSession();
		
		System.out.println(session.getCreationTime()); //创建时间
		System.out.println(session.getLastAccessedTime());//最后一次访问session的时间
		System.out.println(session.getId()  );//获得sessionID
		System.out.println(session.getMaxInactiveInterval());//获得最大存活时间
		//setMaxInactiveInterval(int interval)
		//invalidate 立即销毁session
		System.out.println(session.isNew());//查看当前获得的session是否是新的.只有在第一访问服务器,session是新的.
		session.invalidate();
	}

}
