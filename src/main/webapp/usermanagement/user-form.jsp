<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>User Management Application</title>
</head>
<body>
	<h1>User Management</h1>
	<h2>
		<a href="/usermanagement/new">Add New User</a> &nbsp;&nbsp;&nbsp; <a href="/usermanagement/list">List
			All Users</a>

	</h2>
	<div align="center">
		<c:if test="${user != null}">
			<form action="usermanagement/update" method="post">
		</c:if>
		<c:if test="${user == null}">
			<form action="usermanagement/insert" method="post">
		</c:if>
		<table border="1" cellpadding="5">
			<caption>
				<h2>
					<c:if test="${user != null}">
               Edit User
              </c:if>
					<c:if test="${user == null}">
               Add New User
              </c:if>
				</h2>
			</caption>
			<c:if test="${user != null}">
				<input type="hidden" name="id" value="<c:out value='${user.id}' />" />
			</c:if>
			<tr>
				<th>First Name:</th>
				<td><input type="text" name="first_name" size="45"
					value="<c:out value='${user.first_name}' />" /></td>
			</tr>
			<tr>
				<th>Last Name:</th>
				<td><input type="text" name="last_name" size="45"
					value="<c:out value='${user.last_name}' />" /></td>
			</tr>
			<tr>
				<th>User Email:</th>
				<td><input type="text" name="email" size="45"
					value="<c:out value='${user.email}' />" /></td>
			</tr>
			<tr>
				<th>User Name:</th>
				<td><input type="text" name="username" size="45"
					value="<c:out value='${user.username}' />" /></td>
			</tr>
			<tr>
				<th>Password:</th>
				<td><input type="text" name="password" size="45"
					value="<c:out value='${user.password}' />" /></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit"
					value="Save" /></td>
			</tr>
		</table>
		</form>
	</div>
</body>
</html>