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
	@Column(name = "airport_code")
	protected String airport_code;
	@Column(name = "country")
	protected String country;
	@Column(name = "state")
	protected String state;

	public airport(String airport_name, String airport_code, String country, String state) {
		super();
		this.airport_name = airport_name;
		this.airport_code = airport_code;
		this.country = country;
		this.state = state;
	}

	public airport(int id, String airport_name, String airport_code, String country, String state) {
		super();
		this.id = id;
		this.airport_name = airport_name;
		this.airport_code = airport_code;
		this.country = country;
		this.state = state;
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

	public String getAirport_code() {
		return airport_code;
	}

	public void setAirport_code(String airport_code) {
		this.airport_code = airport_code;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

}
