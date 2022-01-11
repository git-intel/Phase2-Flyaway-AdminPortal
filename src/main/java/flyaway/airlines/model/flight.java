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
@Table(name = "flights")

public class flight {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	protected int id;
	@Column(name = "flight_name")
	protected String flight_name;
	@Column(name = "flight_id")
	protected String flight_id;
	@Column(name = "flight_capacity")
	protected String flight_capacity;
	public flight() {
		// TODO Auto-generated constructor stub
	}

	public flight(String flight_name, String flight_id, String flight_capacity) {
		super();
		this.flight_name = flight_name;
		this.flight_id = flight_id;
		this.flight_capacity = flight_capacity;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getFlight_capacity() {
		return flight_capacity;
	}

	public void setFlight_capacity(String flight_capacity) {
		this.flight_capacity = flight_capacity;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
