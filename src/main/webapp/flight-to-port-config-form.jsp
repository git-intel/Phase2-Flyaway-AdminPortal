<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Airline Management</title>
</head>
<body>
	<h1>Flight Configuration Form</h1>
	<h2>
		<a href="new-flight-to-airport">Add New Flight</a> &nbsp;&nbsp;&nbsp;
		<a href="list-flight-to-airport">List All Flights</a>&nbsp;&nbsp;&nbsp;
		<a href="home">Home</a>

	</h2>
	<div align="center">
		<c:if test="${journey != null}">
			<form action="update-flight-to-airport" method="post">
		</c:if>
		<c:if test="${journey == null}">
			<form action="insert-flight-to-airport" method="post">
		</c:if>
		<table border="1" cellpadding="5">
			<caption>
				<h2>
					<c:if test="${journey != null}">
               Edit flight
              </c:if>
					<c:if test="${journey == null}">
               Add New flight
              </c:if>
				</h2>
			</caption>
			<c:if test="${journey != null}">
				<input type="hidden" name="id"
					value="<c:out value='${journey.id}' />" />
			</c:if>
			<tr>
				<th>Source Airport code:</th>
				<td><input type="text" name="source_airport_code" size="45"
					value="<c:out value='${journey.source_airport_code}' />" /></td>
			</tr>
			<tr>
				<th>Source Airport Name:</th>
				<td><input type="text" name="source_airport_name" size="45"
					value="<c:out value='${journey.source_airport_name}' />" /></td>
			</tr>
			<tr>
				<th>Destination Airport code:</th>
				<td><input type="text" name="destination_airport_code"
					size="45"
					value="<c:out value='${journey.destination_airport_code}' />" /></td>
			</tr>
			<tr>
				<th>Destination Airport Name:</th>
				<td><input type="text" name="destination_airport_name"
					size="45"
					value="<c:out value='${journey.destination_airport_name}' />" /></td>
			</tr>
			<tr>
				<th>Flight Code:</th>
				<td><input type="text" name="flight_code" size="45"
					value="<c:out value='${journey.flight_code}' />" /></td>
			</tr>
			<tr>
				<th>Flight Name:</th>
				<td><input type="text" name="flight_name" size="45"
					value="<c:out value='${journey.flight_name}' />" /></td>
			</tr>
			<tr>
				<th>Departure Date:(MM/dd/yyyy)</th>
				<td><input type="text" name="flight_departure_date" size="45"
					value="<c:out value='${journey.flight_departure_date}' />" /></td>
			</tr>
			<tr>
				<th>Departure time:(hh:mm am/pm)</th>
				<td><input type="text" name="flight_departure_time" size="45"
					value="<c:out value='${journey.flight_departure_time}' />" /></td>
			</tr>
			<tr>
				<th>Arrival Date:(MM/dd/yyyy)</th>
				<td><input type="text" name="flight_departure_date" size="45"
					value="<c:out value='${journey.flight_departure_date}' />" /></td>
			</tr>
			<tr>
				<th>Arrival time:(hh:mm am/pm)</th>
				<td><input type="text" name="flight_arrival_time" size="45"
					value="<c:out value='${journey.flight_arrival_time}' />" /></td>
			</tr>
			<tr>
				<th>Ticket Price ($):</th>
				<td><input type="text" name="ticket_price" size="45"
					value="<c:out value='${journey.ticket_price}' />" /></td>
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