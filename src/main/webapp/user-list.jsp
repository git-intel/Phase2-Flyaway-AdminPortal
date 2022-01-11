<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>User Management Application</title>
</head>
<body>

	<h1>User Management</h1>
	<!-- JSP page for displaying all users from the database. Let's create a list-user.jsp -->
	<h2>
		<a href="new-user">Add New User</a> &nbsp;&nbsp;&nbsp; <a
			href="list-user">List All Users</a> &nbsp;&nbsp;&nbsp; <a href="home">Home</a>

	</h2>

	<div align="center">
		<table border="1">
			<caption>
				<h5>List of Users</h5>
			</caption>
			<tr>
				<th>ID</th>
				<th>FirstName</th>
				<th>LastName</th>
				<th>Email</th>
				<th>UserName</th>
				<th>Password</th>
			</tr>
			<c:forEach var="user" items="${listUser}">
				<tr>
					<td><c:out value="${user.id}" /></td>
					<td><c:out value="${user.first_name}" /></td>
					<td><c:out value="${user.last_name}" /></td>
					<td><c:out value="${user.email}" /></td>
					<td><c:out value="${user.username}" /></td>
					<td><c:out value="${user.password}" /></td>
					<td><a href="edit-user?id=<c:out value='${user.id}' />">Edit</a>
						&nbsp;&nbsp;&nbsp;&nbsp; <a
						href="delete-user?id=<c:out value='${user.id}' />">Delete</a></td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>