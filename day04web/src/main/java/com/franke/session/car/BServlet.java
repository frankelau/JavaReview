package com.franke.session.car;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class BServlet extends HttpServlet {

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
			//1 获得 要添加 的商品(0~5)
			String name = request.getParameter("name");
			int intName = Integer.parseInt(name);
			//2 将数字翻译成中文商品名称 (使用数组)
			String[] products= new String[]{"肥皂","电动车","笔记本","小雨伞","八度空间","床单"};
			String productName = products[intName];
			//3 获得session getSession
				HttpSession session = request.getSession();
			//4 获得session中保存的购物车(Map)
					Map<String,Integer> map= (Map<String, Integer>) session.getAttribute("car");
					if(map!=null){
						//获得到了  ==> 不是第一次访问 ==> 继续向Map中添加
						Integer count = map.get(productName);
						if(count==null){
							//不存在==> 添加并设置数量为1
							count = 1;
						}else{
							//map中已经存在这个商品 ===>  把数量加1
							count++;
						}
						map.put(productName, count);
					}else{
						//没获得到 ==> 第一次访问
						map = new LinkedHashMap<String, Integer>();
						//新建Map==> 将商品添加并设置数量为1
						map.put(productName, 1);
						
					}
			//5 将Map操作完再放回session
					session.setAttribute("car", map);
			//6 返回到列表页面(重定向)
					response.sendRedirect(request.getContextPath()+"/car/list.jsp");
					
	}

}
