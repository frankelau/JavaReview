package com.franke.request.param;

import java.io.IOException;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Map;
import java.util.Map.Entry;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		//1 Map getParameterMap()  获得服务器保存表单参数的容器. 就是map<String,String[]>. 泛型: habit=chi&habit=shui&habit=la
		Map<String,String[]> map = request.getParameterMap();
		
		for(Entry<String, String[]> en : map.entrySet()){
			String key = en.getKey();
			String[] value = en.getValue();
			System.out.println(key+"==>" +Arrays.toString(value));
		}
		
		
		//2Enumeration getParameterNames()  获得提交的所有键
			Enumeration<String> en =  request.getParameterNames();
			while(en.hasMoreElements()){
				String key = en.nextElement();
				System.out.println("提交上来的键==>"+key);
			}
		//3String[] getParameterValues(String name)  根据键获得值. 获得一键对应多个值的情况的.
			String[] habits = request.getParameterValues("habit");
				System.out.println(Arrays.toString(habits));
				
				String habit  = request.getParameter("habit");
				
				System.out.println("getParameter获得多个值==>"+habit);
		}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			this.doGet(request, response);
	}

}
