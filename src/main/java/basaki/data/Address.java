package basaki.data;

import java.io.Serializable;

/**
 * 
 * <tt>Address</tt> is a data model representing an address entity.
 * <p/>
 * 
 * @author Indra Basak
 * 
 */
public class Address implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String street;
	private String city;
	private String state;
	private String zipCode;

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
}
