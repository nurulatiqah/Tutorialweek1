package mooc.fiw1;

import java.util.Scanner;
public class E11 {
	public static void main(String[] args){
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Type a number: ");
		int a = Integer.parseInt(scanner.nextLine());
		System.out.print("Type another number: ");
		int b = Integer.parseInt(scanner.nextLine());
		
		if (a > b){
			System.out.println("The bigger number of the two numbers given was: " +a);
		} 
		if(b > a){
			System.out.println("The bigger number of the two numbers given was: " +b);
		}
		
		
	}
	

}
