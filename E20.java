package mooc.fiw1;

import java.util.Scanner;

public class E20 {

	public static void main(String[] args) {
		String uName = "alex";
		String uName2 = "emily";
		String pWord = "mightyducks";
		String pWord2 = "cat";
		String text = null;
		String text2 = null;
				
		Scanner scanner = new Scanner(System.in);
		{
		System.out.print("Type your username: ");
		text = scanner.nextLine(); 
	
		System.out.print("Type your password: ");
		text2 = scanner.nextLine();
	
		}
		
		if(text.equals(uName) && (text2.equals(pWord))){
			System.out.println("You are now logged into the system");	
		} 
		else if(text.equals(uName2) && (text2.equals(pWord2))) {
			System.out.println("You are now logged into the system");
		}
		else{
			System.out.println("Your username and password are invalid!");
		}
	}
}
