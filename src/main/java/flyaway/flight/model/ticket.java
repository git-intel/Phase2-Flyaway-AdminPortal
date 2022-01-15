package flyaway.flight.model;
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
@Table(name = "ticketsBooked")

public class ticket {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	protected int id;
	@Column(name = "flight_name")
	protected String flight_name;
	@Column(name = "flight_id")
	protected String flight_id;
	@Column(name = "source_airport_id")
	protected String source_airport_id;
	@Column(name = "source_airport_name")
	protected String source_airport_name;
	@Column(name = "destination_airport_id")
	protected String destination_airport_id;
	@Column(name = "destination_airport_name")
	protected String destination_airport_name;
	@Column(name = "flight_arrivaltimedate")
	protected String flight_arrivaltimedate;
	@Column(name = "flight_departuretimedate")
	protected String flight_departuretimedate;

	public ticket() {
		// TODO Auto-generated constructor stub
	}

	

}
