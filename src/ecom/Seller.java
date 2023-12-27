package ecom;

public class Seller extends User {
	
	String products[];
	
	public Seller (String name, String email, String password, int userID) {
		super(name, email, password, userID);
	}

}
