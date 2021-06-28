
public class withdrawFunds {
	
	//Withdraws funds by taking the account number and withdrawl amount as input
	//passing them to bankingSystem and bankServer, then returning confirmation
	public static void withdraw(int acctnum, double amount) {
		double balance;
		System.out.println("Enter Withdraw amount: "+ amount);
		balance =- amount;
		System.out.println("Remaining Balance of the account is: " + balance);
	}
}
