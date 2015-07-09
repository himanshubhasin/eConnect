<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ include file="/WEB-INF/jsp/includes.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Registration Form</title>
</head>
<body>
<center>
<h2>Student Registration Form</h2>
<h5>${param.successmessage}</h5>
	<form:form action="signup.do" method="post" commandName="student">
		<table>
			<tr>
				<td>First Name:</td>
				<td><form:input path="fname" /></td>
			</tr>
			<tr>
				<td>Last Name:</td>
				<td><form:input path="lname" /></td>
			</tr>
			<tr>
				<td>Email:</td>
				<td><form:input path="email" /></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><form:password path="password"/></td>
			</tr>
			<tr>
				<td>Confirm Password:</td>
				<td><form:input path="repassword" /></td>
			</tr>
			<tr>
				<td>Date of Birth:</td>
				<td><form:input path="dob" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" name="action" value="SignUp" /></td>
			</tr>
		</table>
	</form:form>
</center>
	<%-- <table border="1">
		<th>Student Id</th>
		<th>First Name</th>
		<th>Last Name</th>
		<th>Email ID</th>
		<c:forEach items="${studentList}" var="student">
			<tr><td>${student.studentid}</td>
			<td>${student.fname}</td>
			<td>${student.lname}</td>
			<td>${student.email}</td>
			<td>${student.password}</td>
			<td>${student.repassword}</td>
			<td>${student.dob}</td>
			</tr>
		</c:forEach>
	</table> --%>
</body>
</html>