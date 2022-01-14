<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Airport Configuration</title>
</head>
<body>
	<h1>Airport Configuration Form</h1>
	<h2>
		<a href="new-airport">Add New Airport</a> &nbsp;&nbsp;&nbsp; <a
			href="list-airport">List All Airports</a>&nbsp;&nbsp;&nbsp; <a
			href="home">Home</a>

	</h2>
	<div align="center">
		<c:if test="${port != null}">
			<form action="update-airport" method="post">
		</c:if>
		<c:if test="${port == null}">
			<form action="insert-airport" method="post">
		</c:if>
		<table border="1" cellpadding="5">
			<caption>
				<h2>
					<c:if test="${port != null}">
               Edit Airport
              </c:if>
					<c:if test="${port == null}">
               Add New Airport
              </c:if>
				</h2>
			</caption>
			<c:if test="${port != null}">
				<input type="hidden" name="id" value="<c:out value='${port.id}' />" />
			</c:if>
			<tr>
				<th>Airport Name:</th>
				<td><input type="text" name="airport_name" size="45"
					value="<c:out value='${port.airport_name}' />" /></td>
			</tr>
			<tr>
				<th>Airport code:</th>
				<td><input type="text" name="airport_code" size="45"
					value="<c:out value='${port.airport_code}' />" /></td>
			</tr>
			<tr>
				<th>Country:</th>
				<td><input type="text" name="country" size="45"
					value="<c:out value='${port.country}' />" /></td>
			</tr>
			<tr>
				<th>State:</th>
				<td><input type="text" name="state" size="45"
					value="<c:out value='${port.state}' />" /></td>
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