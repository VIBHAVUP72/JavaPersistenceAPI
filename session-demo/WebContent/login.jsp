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
		String message = (String) request.getAttribute("msg");
		if (message != null)
		{
	%>
	<h1><%=message%></h1>
	<%
		}
	%>
	<form action="login" method="post">
		<input type="tel" name="phone" placeholder="Enter Your Phone Number"> <br>
		<input type="password" name="pswd" placeholder="Enter Your Password"> <br>
		<input type="submit" value="LOGIN">
	</form>
</body>
</html>