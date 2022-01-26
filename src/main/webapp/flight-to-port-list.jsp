<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Airline Management</title>
</head>
<body>

	<h1>Flight Configuration</h1>
	<h2>
		<a href="new-flight-to-airport">Add New Flight</a> &nbsp;&nbsp;&nbsp;
		<a href="list-flight-to-airport">List All Flights</a>&nbsp;&nbsp;&nbsp;
		<a href="home">Home</a>

	</h2>

	<div align="center">
		<table border="1">
			<caption>
				<h5>List of Flights</h5>
			</caption>
			<tr>
				<th>ID</th>
				<th>SourceCode</th>
				<th>SourceName</th>
				<th>DestinationCode</th>
				<th>DestinationName</th>
				<th>FlightCode</th>
				<th>FlightName</th>
				<th>DepartureDate</th>
				<th>Time</th>
				<th>ArrivalDate</th>
				<th>Time</th>
				<th>Price($)</th>

			</tr>
			<c:forEach var="flight" items="${listOfFlightstoPort}">
				<tr>
					<td><c:out value="${flight.id}" /></td>
					<td><c:out value="${flight.source_airport_code}" /></td>
					<td><c:out value="${flight.source_airport_name}" /></td>
					<td><c:out value="${flight.destination_airport_code}" /></td>
					<td><c:out value="${flight.destination_airport_name}" /></td>
					<td><c:out value="${flight.flight_code}" /></td>
					<td><c:out value="${flight.flight_name}" /></td>
					<td><c:out value="${flight.flight_departure_date}" /></td>
					<td><c:out value="${flight.flight_departure_time}" /></td>
					<td><c:out value="${flight.flight_arrival_date}" /></td>
					<td><c:out value="${flight.flight_arrival_time}" /></td>
					<td><c:out value="${flight.ticket_price}" /></td>
					<td><a
						href="edit-flight-to-airport?id=<c:out value='${flight.id}' />">Edit</a>
						&nbsp;&nbsp;&nbsp;&nbsp; <a
						href="delete-flight-to-airport?id=<c:out value='${flight.id}' />">Delete</a></td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>