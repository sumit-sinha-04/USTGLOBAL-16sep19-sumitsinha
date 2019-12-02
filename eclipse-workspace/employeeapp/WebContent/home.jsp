<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<jsp:useBean  id="info"  class=" com.ustglobal.employeewebapp.dto.EmployeeInfo"  scope="session" />
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Welcome<%=info.getName()%></h1>
			<a href='./search.html'>search</a>
			<a href='./changepassword.html'>password</a>
			<a href='./logout'>logout</a>
			
</body>
</html>