package basaki.data;

import java.io.Serializable;

/**
 * 
 * <tt>Customer</tt> is a data model representing a customer entity.
 * <p/>
 * 
 * @author Indra Basak
 * 
 */
public class Customer implements Serializable {

	private static final long serialVersionUID = 1L;

	private String id;
	private String firstName;
	private String lastName;
	private Address address;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
}
