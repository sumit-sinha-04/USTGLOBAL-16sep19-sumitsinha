<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<% 
	String id="";
	Cookie[] cookies=request.getCookies();
	if(cookies!=null) {
	for (Cookie cookie : cookies) {
		if(cookie.getName().equals("alwaysRemember")) {
			id=cookie.getValue();
		}
	}
	}

%>


<body>
<fieldset align ='center'>
		<legend>login</legend>
		<form action='./login' method='post'>
		<table align ='center'>
		<tr><td>Id</td>
		<td><input type='number' name='id' value="<%=id %>>"></td></tr>
		<tr> <td>Password</td>
		<td><input type='password' name='password'></td> </tr>
						
		<tr><td><input type = 'checkbox' name ='rememberme' value='checked'></td></tr> 
		<tr><td>Remember Me</td></tr>
				
					
					
		 					<td></td>
							<td><input type = 'submit' value = 'login'></td>
							</tr>
		</table>
		</form>
				" <a href='./register.html'>Register</a>
		</fieldset>
		</html>

