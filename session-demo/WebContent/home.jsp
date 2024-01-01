<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<% 
		String user = (String) session.getAttribute("user");
	%>
	<%
		if(user!=null)
		{
	%>
			<h1>WELCOME TO MY APPLICATION</h1>
			<h2>LOGIN SUCCESFUL</h2>
			<h3>
				<a href="logout">SignOut</a>
			</h3>
	<%
		}
		else
		{
			response.sendRedirect("login.jsp");
		}
	%>
</body>
</html>