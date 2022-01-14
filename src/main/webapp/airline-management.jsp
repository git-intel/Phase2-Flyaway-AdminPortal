<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Airline Management</title>
</head>
<body>
	<h1>Airline Management</h1>
	<h2>
		<a href="chart-new-flight">Chart New Flight</a> &nbsp;&nbsp;&nbsp; <a
			href="list-charted-flight">List All Flight</a>&nbsp;&nbsp;&nbsp; <a
			href="home">Home</a>

	</h2>
	<div align="center">
		<c:if test="${flightData != null}">
			<form action="update-flight-data" method="post">
		</c:if>
		<c:if test="${flightData == null}">
			<form action="insert-flight-data" method="post">
		</c:if>
		<table border="1" cellpadding="5">
			<caption>
				<h2>
					<c:if test="${flightData != null}">
               Edit flight Data
              </c:if>
					<c:if test="${flightData == null}">
               Add flight Data
              </c:if>
				</h2>
			</caption>
			<c:if test="${flightData != null}">
				<input type="hidden" name="id"
					value="<c:out value='${flightData.id}' />" />
			</c:if>
			<tr>
				<th>Flight Name:</th>
				<td><input type="text" name="flight_name" size="45"
					value="<c:out value='${flightData.flight_name}' />" /></td>
			</tr>
			<tr>
				<th>Flight Id:</th>
				<td><input type="text" name="flight_id" size="45"
					value="<c:out value='${flightData.flight_id}' />" /></td>
			</tr>
				<tr>
				<th>Flight Id:</th>
				<td><input type="text" name="flight_id" size="45"
					value="<c:out value='${flightData.flight_id}' />" /></td>
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