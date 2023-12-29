package ecom;

public class Customer extends User {
	
	String address;
	int orders[];
	
	
	public Customer (String name, String email, String password) {
		super(name, email, password);
//		super();
	}
	
	public Customer () {}
	
	public void getCustomer () {
		System.out.println("Customer data:-"+ this.name + " " + this.email);
	}
	
	public String getUserType () {
		return "Customer";
	}

}
