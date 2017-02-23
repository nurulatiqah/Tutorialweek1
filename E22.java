package mooc.fiw1;

import java.util.Scanner;

public class E22 {
	public static void  main(String[] args){
		
		String text = "carrot";
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Type the password: ");
		text = scanner.nextLine();
		
		while(true){	//while
			if(text.equals("carrot")){
			System.out.println("Right! \n");
			System.out.println("The secret is: " +"YOU ARE GENIUS!");
			
			break;
		}	
			
		System.out.print("Type the passwords: ");
		text = scanner.nextLine();
	} //end while
	}
}
