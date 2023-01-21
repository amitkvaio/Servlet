package com.servlet.exception;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyExceptionServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out =response.getWriter();
		try {
			throw new ServletException("GET method is not supported.");
		} catch (Exception e) {
			out.print(e);
			out.println();
			out.print(Arrays.toString(e.getStackTrace()));
		}
	}
}
