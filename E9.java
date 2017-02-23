package mooc.fiw1;

import java.util.Scanner;
public class E9 {
	
	public static void main(String[] args){
		
	@SuppressWarnings("resource")
	Scanner scanner = new Scanner(System.in);
	int a, b;
	
	System.out.println("Enter two integer number:- ");
	
	System.out.print("Type a number: ");
	a = scanner.nextInt();
	
	System.out.print("Type another number: ");
	b = scanner.nextInt();
	
	
	//double a or b for floating result
	double div = a/(double)b;
	System.out.println( "Division " +a  +" / " +b +" = " +div );
	
	}
}
