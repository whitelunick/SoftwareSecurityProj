import java.util.Scanner;

public class customerInterface {
	
	//The menu for the customer interface
	public static void menu() {
		int log = 0;
		while(log != 2) {
			System.out.println("Select option from menu:");
			System.out.println("1. Login");
			System.out.println("2. Log out");
			System.out.println("3. Query Account");
			System.out.println("4. Transfer Funds");
			System.out.println("5. View Profile");
			System.out.println("6. Query Stock");
			System.out.println("7. Buy Stock");
			System.out.println("8. Sell Stock");
			System.out.println("9. Exit");
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
			
			//Query account case
			case 3:
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
			
			//Transfer funds case
			case 4:
				System.out.println("Transfer Funds selected");
				if(log == 1) {
					System.out.println("Enter the account number you would like to transfer from:");
					int acctFrom = scan.nextInt();
					scan.nextLine();
					System.out.println("Enter the account number you would like to transfer to:");
					int acctTo = scan.nextInt();
					scan.nextLine();
					System.out.println("Enter the amount you would like to transfer:");
					double transAmount = scan.nextDouble();
					scan.nextLine();
					transferFunds.transfer(acctFrom, acctTo, transAmount);
					System.out.println("Successfully transferred " + transAmount + " from account " + acctFrom + " to account " + acctTo + ".");
				}
				else {
					System.out.println("Please login first");
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
				
			//Buy Stock case
			case 7:
				System.out.println("Buy Stock selected");
				if(log == 1) {
					System.out.println("Please enter the name of the stock you want to purchase: ");
					String stockName = scan.nextLine();
					System.out.println("Please enter the quantity of the stock you want to purchase: ");
					int stockNum = scan.nextInt();
					scan.nextLine();
					System.out.println("Please enter the unit price of the stock you want to purchase: ");
					double price = scan.nextDouble();
					scan.nextLine();
					System.out.println("Please enter the account number to pay for the stock: ");
					int acctNum = scan.nextInt();
					scan.nextLine();
					buyStock.buy(stockName, stockNum, price, acctNum);
					System.out.println(stockNum + " shares of " + stockName + " have been purchased for " + price + " per share by account " + acctNum + ".");
				}
				else {
					System.out.println("Please login first");
				}
				break;
				
			//Sell Stock case
			case 8:
				System.out.println("Sell Stock selected");
				if(log == 1) {
					System.out.println("Please enter the name of the stock you want to sell: ");
					String stockName = scan.nextLine();
					System.out.println("Please enter the quantity of the stock you want to sell: ");
					int stockNum = scan.nextInt();
					scan.nextLine();
					System.out.println("Please enter the unit price of the stock you want to sell: ");
					double price = scan.nextDouble();
					scan.nextLine();
					System.out.println("Please enter the account number to receive funds for selling the stock: ");
					int acctNum = scan.nextInt();
					scan.nextLine();
					sellStock.sell(stockName, stockNum, price, acctNum);
					System.out.println(stockNum + " shares of " + stockName + " have been sold for " + price + " per share by account " + acctNum + ".");
				}
				else {
					System.out.println("Please login first");
				}
				break;
			
			//Exit case
			case 9:
				System.out.println("Exit selected, returning to main menu");
				log = 2;
				break;
				
			default:
				System.out.println("Error, select an option 1-9");
			}
		}	
		}
		
}
