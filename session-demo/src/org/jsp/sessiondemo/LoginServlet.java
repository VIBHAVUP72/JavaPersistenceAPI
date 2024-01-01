package org.jsp.sessiondemo;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login")
public class LoginServlet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		long phone = Long.parseLong(req.getParameter("phone"));
		String password = req.getParameter("pswd");
		RequestDispatcher d = null;
		PrintWriter w = resp.getWriter();
		if(phone == 8989 && password.equals("rs123"))
		{
			HttpSession s = req.getSession();
			s.setAttribute("user","User2");
			d = req.getRequestDispatcher("home.jsp");
			d.forward(req, resp);
		}
		else
		{
			w.write("<html><body><h2>Invalid Phone Number OR Password</h2></body></html>");
			d = req.getRequestDispatcher("login.jsp");
			d.include(req, resp);
		}
	}
}
