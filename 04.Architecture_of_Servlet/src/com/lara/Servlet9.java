package com.lara;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet9 extends HttpServlet
{
	@Override
	public void init(ServletConfig config)
	{
		System.out.println("from init()");
	}

	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException
	{

		ServletContext c1 = getServletContext();
		PrintWriter out = response.getWriter();
		System.out.println("service()");
		out.print("This is service() method ");
	}

}
