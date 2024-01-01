package org.jsp.loginservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jdk.internal.org.objectweb.asm.commons.SerialVersionUIDAdder;

@WebServlet("/print")
public class printServlet extends HttpServlet
{
	private static final long SerialVersionUID = 1L;
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		int id = Integer.parseInt(req.getParameter("id"));
		String name = req.getParameter("name"); 
		String password = req.getParameter("pswd"); 
		int age = Integer.parseInt(req.getParameter("age"));
		int phone = Integer.parseInt(req.getParameter("phone"));
		
		PrintWriter w = resp.getWriter();
		User u = new User(id, age, name, password, phone);
		req.setAttribute("obj", u);
		RequestDispatcher d = req.getRequestDispatcher("print.jsp");
		d.forward(req, resp);
	}
}
