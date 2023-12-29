package ecom;

public class Seller extends User {
	
	String products[];
	
	public Seller (String name, String email, String password) {
		super(name, email, password);
	}
	
	public Seller () {}
	
	
	public String getUserType () {
		return "Seller";
	}

}
