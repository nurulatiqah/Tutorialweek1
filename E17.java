package mooc.fiw1;
import java.util.Scanner;
public class E17 {
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Type the first number: ");
		int a = scanner.nextInt();
		System.out.print("Type the second number: ");
		int b = scanner.nextInt();
		
		if(a > b){
			System.out.println("Greater number is " +a);
		} else if (b > a){
			System.out.println("Greater number is " +b);
		} else{
			System.out.println("Number " +a +" and " +b +" are equal!");
		}
	}

}
