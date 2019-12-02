<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<jsp:useBean id="info" class="com.ustglobal.employeewebapp.dto.EmployeeInfo" scope="request"/>
<body>
<a href='./home'>Home</a>


		<a style='float:right' href='./logout'>Logout</a>
		
	<%if(info!=null){ %>
		<table align='center'>
		<tr>
		<th>ID</th><th>Name</th><th>Email</th>
		</tr>
		
		<tr>
		<td>
<%=info.getId()%>
		</td>
		<td>
	<%=info.getName()%>
		</td>
		<td>
	<%=info.getEmail()%>
		</td>
		
		
		
		</tr>
		</table>
		
		<% }else {%>
		<h1>no data found</h1>
<% }%>
</body>
</html>