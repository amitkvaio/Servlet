package com.lara;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet5 extends HttpServlet
{
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp)
				throws ServletException, IOException
		{
			PrintWriter out = resp.getWriter();
			out.println("Servlet5:");
			System.out.println("Servlet5");
			out.println("NullPointerException");
		}
}
