package com.franke.request.info;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AServlet extends HttpServlet {

	private static final long serialVersionUID = 3408916591782804506L;

	/*	http://127.0.0.1:8080/day04web/AServlet?a=1&b=2&c=3	*/	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("request.getContentLength(): " + request.getContentLength());
		System.out.println("request.getContentType(): " + request.getContentType());
		System.out.println("request.getContextPath(): " + request.getContextPath());
		System.out.println("request.getMethod(): " + request.getMethod());
		System.out.println("request.getLocale(): " + request.getLocale());
			
		System.out.println("request.getQueryString(): " + request.getQueryString());
		System.out.println("request.getRequestURI(): " + request.getRequestURI());
		System.out.println("request.getRequestURL(): " + request.getRequestURL());
		System.out.println("request.getServletPath(): " + request.getServletPath());
		System.out.println("request.getRemoteAddr(): " + request.getRemoteAddr());
		System.out.println("request.getRemoteHost(): " + request.getRemoteHost());
		System.out.println("request.getRemotePort(): " + request.getRemotePort());
		System.out.println("request.getScheme(): " + request.getScheme());
		System.out.println("request.getServerName(): " + request.getServerName());
		System.out.println("request.getServerPort(): " + request.getServerPort());

	}
	/*
		request.getContentLength(): -1
		request.getContentType(): null
		request.getContextPath(): /day04web
		request.getMethod(): GET
		request.getLocale(): zh_CN
		request.getQueryString(): a=1&b=2&c=3
		request.getRequestURI(): /day04web/AServlet
		request.getRequestURL(): http://127.0.0.1:8080/day04web/AServlet
		request.getServletPath(): /AServlet
		request.getRemoteAddr(): 127.0.0.1
		request.getRemoteHost(): 127.0.0.1
		request.getRemotePort(): 53825
		request.getScheme(): http
		request.getServerName(): 127.0.0.1
		request.getServerPort(): 8080
	*/

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
