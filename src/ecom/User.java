package ecom;

public class User {
	
	String name;
	protected String email;
	private String password;
	int userID;
	
	public User (String name, String useremail, String password, int userID) {
		
		this.name = name;
		email = useremail;
		this.password = password;
		this.userID = userID;
		
		
		
		System.out.println("Constructor called");
		
	}
	
//	public User () {
//		
//	}
	
	public void getUser () {
		
		if(this.email.length() == 0) {
			System.out.println("Invalid user!");
		} else {
			System.out.println("The student:" + this.name);
		}
	}
	

}
