<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ include file="/WEB-INF/jsp/includes.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Change Password</title>
</head>
<body>
<center>
<h2>Change Password</h2>
<h5>${param.stuchangepwd}</h5>
		<form:form action="stuchangepwd.do" method="post"
			commandName="student">
			<table>
				<tr>
					<td>Email:</td>
					<td><form:input path="email" value="${param.email}" /></td>
				</tr>
				<tr>
					<td>Password:</td>
					<td><form:input path="password" /></td>
				</tr>
				<tr>
					<td>Confirm Password:</td>
					<td><form:password path="repassword" /></td>
				</tr>

				<tr>
					<td colspan="2"><input type="submit" name="action"
						value="Change Password" /></td>
				</tr>
			</table>
		</form:form>
	</center>

</body>
</html>