<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ include file="/WEB-INF/jsp/includes.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Management</title>
</head>
<body>
	<form:form action="student.do" method="post" commandName="student">
		<table>
			<tr>
				<td>Student Id:</td>
				<td><form:input path="studentid" /></td>
			</tr>
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
				<td colspan="2"><input type="submit" name="action" value="add" />
					<input type="submit" name="action" value="edit" /> <input
					type="submit" name="action" value="delete" /> <input type="submit"
					name="action" value="search" /></td>
			</tr>
		</table>
	</form:form>
	<table border="1">
		<th>Student Id</th>
		<th>First Name</th>
		<th>Last Name</th>
		<th>Email</th>
		<c:forEach items="${studentList}" var="student">
			<tr>${student.studentid}</tr>
			<tr>${student.fname}</tr>
			<tr>${student.lname}</tr>
			<tr>${student.email}</tr>
		</c:forEach>
	</table>
</body>
</html>