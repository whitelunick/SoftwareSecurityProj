import java.util.Scanner;

public class bankInterface {
	//The menu for the bank interface
		public static void menu() {
			int log = 0;
			while(log != 2) {
				System.out.println("Select option from menu:");
				System.out.println("1. Login");
				System.out.println("2. Log out");
				System.out.println("3. Withdraw");
				System.out.println("4. Query Account");
				System.out.println("5. View Profile");
				System.out.println("6. Query Stock");
				System.out.println("7. Exit");
				Scanner scan = new Scanner(System.in);
				int menu = scan.nextInt();
				scan.nextLine();
				
				switch(menu) {
				
				//Login case
				case 1:
					System.out.println("Login selected");
					if(log == 0) {
						System.out.println("Enter username");
						String username = scan.nextLine();
						
						System.out.println("Enter password");
						String pass = scan.nextLine();
						
						login.login(username, pass);
						log = 1;
					}
					else {
						System.out.println("User already logged in");
					}
					break;
					
				//Log out case
				case 2:
					System.out.println("Log out selected");
					if(log == 1) {
						logout.logout();
						log = 2;
					}
					else {
						System.out.println("Please login first.");
					}
					break;
					
				//Withdraw case	
				case 3:
					System.out.println("Withdraw selected");
					if(log == 1) {
						System.out.println("Please enter the account number to withdraw from:");
						int acctnum = scan.nextInt();
						scan.nextLine();
						System.out.println("Please enter the amount to withdraw from account " + acctnum + " :");
						double withdrawl = scan.nextDouble();
						scan.nextLine();
						withdrawFunds.withdraw(acctnum, withdrawl);
						System.out.println("Successfully withdrawed " + withdrawl + " from account " + acctnum + ".");
					}
					else {
						System.out.println("Please login first.");
					}
					break;
				
				//Query account case
				case 4:
					System.out.println("Query Account selected");
					if(log == 1) {
						System.out.println("Enter the account number you would like the balance of:");
						int acctnum = scan.nextInt();
						scan.nextLine();
						double balance = queryAccount.query(acctnum);
						System.out.println("The balance of the account is " + balance);
					}
					else {
						System.out.println("Please login first.");
					}
					break;
					
				//View profile case
				case 5:
					System.out.println("View Profile selected");
					if(log == 1) {
						System.out.println("Please enter the customer's name:");
						String name = scan.nextLine();
						System.out.println("Please enter the customer's Social Security Number:");
						int ssn = scan.nextInt();
						scan.nextLine();
						viewProfile.view(name, ssn);
					}
					else {
						System.out.println("Please login first");
					}
					break;
					
				//Query stock case
				case 6:
					System.out.println("Query Stock selected");
					if(log == 1) {
						System.out.println("Please enter the customer's name:");
						String name = scan.nextLine();
						queryStock.query(name);
					}
					else {
						System.out.println("Please login first");
					}
					break;
				
				//Exit case
				case 7:
					System.out.println("Exit selected, returning to main menu");
					log = 2;
					break;
					
				default:
					System.out.println("Error, select an option 1-10");
				}
			}	
}
}