<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Successful</title>
</head>
<body>
Valid Login
 <table border="1">
		<th>First Name</th>
		<th>Last Name</th>
		<th>Email ID</th>
		<th>Password</th>
		<th>Confirm Password</th>
		<th>Date of Birth</th>
		
			<tr>
			<td>${student.fname}</td>
			<td>${student.lname}</td>
			<td>${student.email}</td>
			<td>${student.password}</td>
			<td>${student.repassword}</td>
			<td>${student.dob}</td>
			</tr>
		
	</table>
</body>
</html>