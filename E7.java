package mooc.fiw1;

import java.util.Scanner;

public class E7 {
public static void main (String[] args){
		
		@SuppressWarnings("resource")
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Enter two number: ");
		int a = Integer.parseInt(reader.nextLine());
		int b = Integer.parseInt(reader.nextLine());
		
		int mul = a * b;
		
		
		System.out.println("The sum for number " +a +" x " +b +" is = " +mul);
		
	}
}
