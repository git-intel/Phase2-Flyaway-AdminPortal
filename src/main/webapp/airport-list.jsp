<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Airport Configuration</title>
</head>
<body>

	<h1>Airports Configuration</h1>
	<!-- JSP page for displaying all users from the database. Let's create a list-user.jsp -->
	<h2>
		<a href="new-airport">Add New Airport</a> &nbsp;&nbsp;&nbsp; <a
			href="list-airport">List All Airports</a>&nbsp;&nbsp;&nbsp; <a
			href="home">Home</a>

	</h2>

	<div align="center">
		<table border="1">
			<caption>
				<h5>List of Airports</h5>
			</caption>
			<tr>
				<th>ID</th>
				<th>Airport Name</th>
				<th>Airport code</th>
				<th>Country</th>
				<th>State</th>

			</tr>
			<c:forEach var="port" items="${listAirport}">
				<tr>
					<td><c:out value="${port.id}" /></td>
					<td><c:out value="${port.airport_name}" /></td>
					<td><c:out value="${port.airport_code}" /></td>
					<td><c:out value="${port.country}" /></td>
					<td><c:out value="${port.state}" /></td>

					<td><a href="edit-airport?id=<c:out value='${port.id}' />">Edit</a>
						&nbsp;&nbsp;&nbsp;&nbsp; <a
						href="delete-airport?id=<c:out value='${port.id}' />">Delete</a></td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>