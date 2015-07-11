<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="/WEB-INF/jsp/includes.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit Student Profile</title>
</head>
<body>
<center>
<h2>Update Your Profile</h2>
<h5>${successmessage}</h5>
	<form:form action="updatestudent.do" method="post" commandName="student">
		<table>
			<tr>
				<td>First Name:</td>
				<td><form:input path="fname" value="${param.fname}"/></td>
			</tr>
			<tr>
				<td>Last Name:</td>
				<td><form:input path="lname" value="${param.lname}"/></td>
			</tr>
			<tr>
				<td>Email:</td>
				<td><form:input path="email" value="${param.email}"/></td>
			</tr>
			<tr>
				<td>Date of Birth:</td>
				<td><form:input path="dob" value="${param.dob}"/></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" name="action" value="Update" /></td>
			</tr>
		</table>
	</form:form>
</center>
</body>
</html>