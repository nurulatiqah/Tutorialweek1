package mooc.fiw1;
import java.util.Scanner;
public class E6 {
	public static void main (String[] args){
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter two number: ");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		int sum = a + b;
		
		
		System.out.println("The sum for number " +a +" + " +b +" is = " +sum);
		
	}

}
