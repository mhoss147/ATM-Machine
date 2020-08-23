import java.io.IOException;
import java.security.KeyStore.Entry;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

public class OptionMenu extends Account {
	
	Scanner menuInput = new Scanner(System.in);
	DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");
	
	HashMap<Integer, Integer> data = new HashMap<Integer, Integer>();
	
	/* Validate Login information with customer number and pin */
	
	public void getLogin() throws IOException {
		
		int x = 1;
		
		
		
		
		do {
			try {
			
			data.put(9876543, 9876);
			
			System.out.println("Welcome to the ATM Machine!");
			
			System.out.println("Enter your customer number: ");
			setCustomerNumber(menuInput.nextInt());
			
			System.out.println("Enter your pin number: ");
			setPinNumber(menuInput.nextInt());
			
			
		} catch (Exception e) {
			
			System.out.println("\n" + "Invalid character(s). Only numbers." + "\n");
			
			x = 2;
			
			for(Entry<Integer, Integer> entry : data.entrySet()) {
				
				if(entry.getKey() == getCustomerNumber() && entry.getValue() == getPinNumber())
					getAccountType();
			}
		}
		System.out.println("\n" + "Wrong customer number or Pin number." + "\n");
	} while (x == 1);
}

	/* Display account type menu with selection */
	
private void getAccountType() {
		
		System.out.println("Select the account you want to access: ");
		System.out.println("Type 1 - Chequeing account");
		System.out.println("Type 2 - Saving account");
		System.out.println("Type 3 - Exit");
		System.out.print("Choice: ");
		
		selection = menuInput.nextInt();	
		
		switch (selection) {
		case 1:
			getChequeing();
			break;
			
		case 2:
			getSaving();
			break;
			
		case 3:
			System.out.println("Thank you for using this ATM");
			break;

		default:
			System.out.println("\n" + "Invalid choice." + "\n");
			break;
		}
		
	}


	
	
}
