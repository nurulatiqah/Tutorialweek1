package mooc.fiw1;

import java.util.Scanner;
public class E12 {
	
public static void main(String[] args){
	@SuppressWarnings("resource")
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("Type your name: ");
	String name = scanner.nextLine(); 
	
	System.out.print("Type your age: ");
	int a = Integer.parseInt(scanner.nextLine());
	
	System.out.print("Type your name: ");
	String name2 = scanner.nextLine(); 
	
	System.out.print("Type your age: ");
	int b = Integer.parseInt(scanner.nextLine());
	
	int totalAge = a + b;
	
	System.out.print(name +" and " +name2 +" are " +totalAge +" years old.");
}
}
