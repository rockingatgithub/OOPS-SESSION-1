package ecom;

public abstract class User {
	
	String name;
	protected String email;
	private String password;
	int userID;
	private static int totalUser = 0;
	
	public User (String name, String useremail, String password) {
		
		totalUser++;
		this.name = name;
		email = useremail;
		this.password = password;
		this.userID = totalUser;
		
		
		
		System.out.println("Constructor called");
		
	}
	
	public User () {
		totalUser++;
		this.userID = totalUser;
	}
	
	public void getUser () {
		
		if(this.email.length() == 0) {
			System.out.println("Invalid user!");
		} else {
			System.out.println("The student:" + this.name + "ID:-"+ this.userID);
		}
	}
	
	public static int getTotalUserCount () {
//		getUser();
		return totalUser;
	}
	
	abstract public String getUserType();
	

}
