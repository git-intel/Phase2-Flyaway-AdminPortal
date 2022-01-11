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
@Table(name = "airports")
public class airport {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	protected int id;
	@Column(name = "airport_name")
	protected String airport_name;
	@Column(name = "airport_id")
	protected String airport_id;
	@Column(name = "airport_address")
	protected String airport_address;

	public airport() {
		// TODO Auto-generated constructor stub
	}

	public airport(String airport_name, String airport_id, String airport_address) {
		super();
		this.airport_name = airport_name;
		this.airport_id = airport_id;
		this.airport_address = airport_address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAirport_name() {
		return airport_name;
	}

	public void setAirport_name(String airport_name) {
		this.airport_name = airport_name;
	}

	public String getAirport_id() {
		return airport_id;
	}

	public void setAirport_id(String airport_id) {
		this.airport_id = airport_id;
	}

	public String getAirport_address() {
		return airport_address;
	}

	public void setAirport_address(String airport_address) {
		this.airport_address = airport_address;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
