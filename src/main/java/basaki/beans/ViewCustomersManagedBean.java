package basaki.beans;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import basaki.data.Address;
import basaki.data.Customer;

/**
 * 
 * <tt>ViewCustomersManagedBean</tt> is the customer managed bean registered
 * with the JSF framework. It is the data model for the JSF page. It returns a
 * list of customers wit their addresses.
 * <p/>
 * 
 * @author Indra Basak
 * 
 */
@Controller("customerBean")
@Scope("session")
public class ViewCustomersManagedBean {
	private List<Customer> customers;

	public ViewCustomersManagedBean() {
		customers = new ArrayList<Customer>();
		populateCustomerList();
	}

	//@PostConstruct
	public void populateCustomerList() {
		Customer cust = new Customer();
		cust.setId("1");
		cust.setFirstName("Robert");
		cust.setLastName("Land");
		Address addr = new Address();
		addr.setStreet("2486 Maxwell Farm Road");
		addr.setCity("Waynesboro");
		addr.setState("VA");
		addr.setZipCode("22980");
		cust.setAddress(addr);
		customers.add(cust);

		cust = new Customer();
		cust.setId("2");
		cust.setFirstName("James");
		cust.setLastName("Brenner");
		addr = new Address();
		addr.setStreet("585 Pennsylvania Avenue");
		addr.setCity("New Brunswick");
		addr.setState("NJ");
		addr.setZipCode("08901");
		cust.setAddress(addr);
		customers.add(cust);

		cust = new Customer();
		cust.setId("3");
		cust.setFirstName("Billy");
		cust.setLastName("Jones");
		addr = new Address();
		addr.setStreet("1201 Still Pastures Drive");
		addr.setCity("Columbia");
		addr.setState("SC");
		addr.setZipCode("29210");
		cust.setAddress(addr);
		customers.add(cust);
	}

	public List<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}
}
