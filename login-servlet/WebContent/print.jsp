<%@page import="org.jsp.loginservlet.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Welcome to the World of JSP</h1>
	<%
	
		User u = (User) request.getAttribute("obj");
	
	%>
	<h2>ID : <%=u.getId() %></h2>
	
	<h2>NAME : <%=u.getName() %></h2>
	
	<h2>PHONE : <%=u.getPhone() %></h2>
	
	<h2>AGE : <%=u.getAge() %></h2>
	
</body>
</html>