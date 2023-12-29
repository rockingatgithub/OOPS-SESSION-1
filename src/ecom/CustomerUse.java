package ecom;

public class CustomerUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Customer c2 = new Customer();
		System.out.println("The customer c2 details:-" + Customer.getTotalUserCount() + "ID:- " + c2.userID);
		
		System.out.println("Total users count:-" + Customer.getTotalUserCount());
		
		
		User user1 = new Customer();
		user1 = new Seller();
		user1.email = "coding@ninjas.com";
//		user1.address = "India";
		
		
//		Customer c3 = (Customer) new User("C3", "coding@ninjas.com", "159357852");
		
//		System.out.print(c3.address);
		
		System.out.println(user1.getUserType());
		

	}

}
