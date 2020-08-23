import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

public class OptionMenu extends Account {
	
	Scanner menuInput = new Scanner(System.in);
	DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");
	
	HashMap<Integer, Integer> data = new HashMap<Integer, Integer>();
	
	public void getLogin() throws IOException {
		
		int x = 1;
		
		
		try {
			
			data.put(9876543, 9876);
			
			System.out.println("Welcome to the ATM Machine!");
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	
	
	
}
