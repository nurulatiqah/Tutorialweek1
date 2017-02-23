package mooc.fiw1;

import java.util.Scanner;
public class E8 {
	public static void main(String[] args){
		@SuppressWarnings("resource")
		Scanner reader = new Scanner(System.in); 
		
		System.out.print("Type a number:");
		int a = Integer.parseInt(reader.nextLine());
		
		System.out.print("Type another number:");
		int b = Integer.parseInt(reader.nextLine());
		
		int sum = a + b;
		System.out.println("Sum of the numbers is: " +sum);
	}

}
