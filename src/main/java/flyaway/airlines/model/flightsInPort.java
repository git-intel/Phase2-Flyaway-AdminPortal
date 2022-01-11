package flyaway.airlines.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * User.java This is a model class represents a User entity
 * 
 * @author Ajay AUgustine
 *
 */

@Entity
@Table(name = "flightsInPort")

public class flightsInPort {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	protected int id;
	@Column(name = "source_airport_id")
	protected String source_airport_id;
	@Column(name = "destination_airport_id")
	protected String destination_airport_id;
	public flightsInPort(String source_airport_id, String destination_airport_id, String source_airport_name,
			String destination_airport_name, String flight_name, String flight_id, String flight_arrivaltimedate,
			String flight_departuretimedate, String ticket_price) {
		super();
		this.source_airport_id = source_airport_id;
		this.destination_airport_id = destination_airport_id;
		this.source_airport_name = source_airport_name;
		this.destination_airport_name = destination_airport_name;
		this.flight_name = flight_name;
		this.flight_id = flight_id;
		this.flight_arrivaltimedate = flight_arrivaltimedate;
		this.flight_departuretimedate = flight_departuretimedate;
		this.ticket_price = ticket_price;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getSource_airport_id() {
		return source_airport_id;
	}


	public void setSource_airport_id(String source_airport_id) {
		this.source_airport_id = source_airport_id;
	}


	public String getDestination_airport_id() {
		return destination_airport_id;
	}


	public void setDestination_airport_id(String destination_airport_id) {
		this.destination_airport_id = destination_airport_id;
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


	public String getFlight_name() {
		return flight_name;
	}


	public void setFlight_name(String flight_name) {
		this.flight_name = flight_name;
	}


	public String getFlight_id() {
		return flight_id;
	}


	public void setFlight_id(String flight_id) {
		this.flight_id = flight_id;
	}


	public String getFlight_arrivaltimedate() {
		return flight_arrivaltimedate;
	}


	public void setFlight_arrivaltimedate(String flight_arrivaltimedate) {
		this.flight_arrivaltimedate = flight_arrivaltimedate;
	}


	public String getFlight_departuretimedate() {
		return flight_departuretimedate;
	}


	public void setFlight_departuretimedate(String flight_departuretimedate) {
		this.flight_departuretimedate = flight_departuretimedate;
	}


	public String getTicket_price() {
		return ticket_price;
	}


	public void setTicket_price(String ticket_price) {
		this.ticket_price = ticket_price;
	}


	@Column(name = "source_airport_name")
	protected String source_airport_name;
	@Column(name = "destination_airport_name")
	protected String destination_airport_name;
	@Column(name = "flight_name")
	protected String flight_name;
	@Column(name = "flight_id")
	protected String flight_id;
	@Column(name = "flight_arrivaltimedate")
	protected String flight_arrivaltimedate;
	@Column(name = "flight_departuretimedate")
	protected String flight_departuretimedate;
	@Column(name = "ticket_price")
	protected String ticket_price;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
