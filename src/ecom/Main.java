package ecom;

public class Main {
	
	public static void main (String args[]) {
		User user1 = new User("Coding Ninjas", "coding@ninjas.com", "1234", 10);
		User user2 = new User("Coding Ninjas 2", "", "1234", 10);
		
//		user1.email = "";
//		user2.password = "";
		
		user1.getUser();
		user2.getUser();
		
//		System.out.println("User2 email:-" + user2.email);
		
	}

}
