package mooc.fiw1;
import java.util.Scanner;
public class E14 {

	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		int number;
		System.out.print("Enter a number:");
		number = scanner.nextInt();
		
		if(number >= 0){
			System.out.println("The number is positive number");
		}
		else{
			System.out.println("The number is negative number");
		}
	}
}

