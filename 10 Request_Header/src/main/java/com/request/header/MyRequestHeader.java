package com.request.header;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyRequestHeader
 */
@WebServlet("/MyRequestHeader")
public class MyRequestHeader extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Enumeration<String> headerNames = request.getHeaderNames(); 
		PrintWriter out = response.getWriter();
		
		out.write("<html><head><title>Header Details</title></head><body>");
		
		while(headerNames.hasMoreElements()) {
			System.out.println(headerNames.nextElement());
			out.print(headerNames.nextElement());
			out.print("</br>");
			//getMyHeader(request, response);
		}
		out.write("<br><br>");
		out.write("<a href=\'more.html\'>Please Here to know about it.</a>");
		out.write("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
	public void getMyHeader(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name, value;
		Enumeration<String> headerNames = request.getHeaderNames();
		PrintWriter out = response.getWriter();
		out.print("##########################################");
		while (headerNames.hasMoreElements()) {
			name = headerNames.nextElement();
			value = request.getHeader(name);
			out.print(name + "::" + value +"</br>" );
			out.println();
		}
	}
}
