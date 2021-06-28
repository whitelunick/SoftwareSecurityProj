
public class viewProfile {
	
	//Takes the customer's name and ssn as inputs, passes them to the bankSystem and bankServer
	//returns their profile info, and prints it
	public static void view(String name, int ssn) {
		System.out.println("Customer's profile:");
		System.out.println("Name: " + name);
		System.out.println("Social Security Number:" + ssn);
		System.out.println("Address: " + "test");
		System.out.println("Phone: " + "test");
		System.out.println("Income: " + "test");
		System.out.println("Email: " + "test");
	}
}
