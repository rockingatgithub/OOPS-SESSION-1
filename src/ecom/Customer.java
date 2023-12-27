package ecom;

public class Customer extends User {
	
	String address;
	int orders[];
	
	
	public Customer (String name, String email, String password, int userID) {
		super(name, email, password, userID);
	}
	
	public void getCustomer () {
		System.out.println("Customer data:-"+ this.name + " " + this.email);
	}

}
