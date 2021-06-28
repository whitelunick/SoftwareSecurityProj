import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Select your user type or exit:");
		System.out.println("1. Customer");
		System.out.println("2. Bank Teller");
		System.out.println("3. Exit");
		Scanner scan = new Scanner(System.in);
		int menu = scan.nextInt();
		scan.nextLine();
		
		while(menu != 3) {
			if(menu == 1) {
				System.out.println("Customer selected");
				customerInterface.menu();
			}
			else if(menu == 2) {
				System.out.println("Bank Teller selected");
				bankInterface.menu();
			}
			else if(menu == 3) {
				System.out.println("Exit selected");
			}
			else {
				System.out.println("Error, select an option 1-3");
			}
			System.out.println("Select your user type or exit:");
			System.out.println("1. Customer");
			System.out.println("2. Bank Teller");
			System.out.println("3. Exit");
			menu = scan.nextInt();
			scan.nextLine();
		}
	}

}
