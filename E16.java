package mooc.fiw1;
import java.util.Scanner;
public class E16 {
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		int num;
		System.out.println("Type a number:");
		num = scanner.nextInt();
		
		if(num % 2==0){
			System.out.println("Number " +num +" is even");
		}else if(num % 2==1) //cannot else alone
			System.out.println("Number " +num +" is odd");
		
	}

}
