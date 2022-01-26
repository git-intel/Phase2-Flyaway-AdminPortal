package flyaway.airlines.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * User.java This is a model class represents a User entity
 * 
 * @author Ajay Augustine
 *
 */

@Entity
@Table(name = "flightAtPort")
public class FlightAtPort {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	protected int id;
	@Column(name = "source_airport_code")
	protected String source_airport_code;
	@Column(name = "destination_airport_code")
	protected String destination_airport_code;

	@Column(name = "source_airport_name")
	protected String source_airport_name;
	@Column(name = "destination_airport_name")
	protected String destination_airport_name;

	@Column(name = "flight_code")
	protected String flight_code;
	@Column(name = "flight_name")
	protected String flight_name;

	@Column(name = "flight_departure_date")
	protected String flight_departure_date;
	@Column(name = "flight_departure_time")
	protected String flight_departure_time;

	@Column(name = "flight_arrival_date")
	protected String flight_arrival_date;
	@Column(name = "flight_arrival_time")
	protected String flight_arrival_time;

	@Column(name = "ticket_price")
	protected String ticket_price;

	public FlightAtPort() {
	}

	public FlightAtPort(String source_airport_code, String destination_airport_code, String source_airport_name,
			String destination_airport_name, String flight_code, String flight_name, String flight_departure_date,
			String flight_departure_time, String flight_arrival_date, String flight_arrival_time, String ticket_price) {
		super();
		this.source_airport_code = source_airport_code;
		this.destination_airport_code = destination_airport_code;
		this.source_airport_name = source_airport_name;
		this.destination_airport_name = destination_airport_name;
		this.flight_code = flight_code;
		this.flight_name = flight_name;
		this.flight_departure_date = flight_departure_date;
		this.flight_departure_time = flight_departure_time;
		this.flight_arrival_date = flight_arrival_date;
		this.flight_arrival_time = flight_arrival_time;
		this.ticket_price = ticket_price;
	}

	public FlightAtPort(int id, String source_airport_code, String destination_airport_code, String source_airport_name,
			String destination_airport_name, String flight_code, String flight_name, String flight_departure_date,
			String flight_departure_time, String flight_arrival_date, String flight_arrival_time, String ticket_price) {
		super();
		this.id = id;
		this.source_airport_code = source_airport_code;
		this.destination_airport_code = destination_airport_code;
		this.source_airport_name = source_airport_name;
		this.destination_airport_name = destination_airport_name;
		this.flight_code = flight_code;
		this.flight_name = flight_name;
		this.flight_departure_date = flight_departure_date;
		this.flight_departure_time = flight_departure_time;
		this.flight_arrival_date = flight_arrival_date;
		this.flight_arrival_time = flight_arrival_time;
		this.ticket_price = ticket_price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSource_airport_code() {
		return source_airport_code;
	}

	public void setSource_airport_code(String source_airport_code) {
		this.source_airport_code = source_airport_code;
	}

	public String getDestination_airport_code() {
		return destination_airport_code;
	}

	public void setDestination_airport_code(String destination_airport_code) {
		this.destination_airport_code = destination_airport_code;
	}

	public String getSource_airport_name() {
		return source_airport_name;
	}

	public void setSource_airport_name(String source_airport_name) {
		this.source_airport_name = source_airport_name;
	}

	public String getDestination_airport_name() {
		return destination_airport_name;
	}

	public void setDestination_airport_name(String destination_airport_name) {
		this.destination_airport_name = destination_airport_name;
	}

	public String getFlight_code() {
		return flight_code;
	}

	public void setFlight_code(String flight_code) {
		this.flight_code = flight_code;
	}

	public String getFlight_name() {
		return flight_name;
	}

	public void setFlight_name(String flight_name) {
		this.flight_name = flight_name;
	}

	public String getFlight_departure_date() {
		return flight_departure_date;
	}

	public void setFlight_departure_date(String flight_departure_date) {
		this.flight_departure_date = flight_departure_date;
	}

	public String getFlight_departure_time() {
		return flight_departure_time;
	}

	public void setFlight_departure_time(String flight_departure_time) {
		this.flight_departure_time = flight_departure_time;
	}

	public String getFlight_arrival_date() {
		return flight_arrival_date;
	}

	public void setFlight_arrival_date(String flight_arrival_date) {
		this.flight_arrival_date = flight_arrival_date;
	}

	public String getFlight_arrival_time() {
		return flight_arrival_time;
	}

	public void setFlight_arrival_time(String flight_arrival_time) {
		this.flight_arrival_time = flight_arrival_time;
	}

	public String getTicket_price() {
		return ticket_price;
	}

	public void setTicket_price(String ticket_price) {
		this.ticket_price = ticket_price;
	}

}
