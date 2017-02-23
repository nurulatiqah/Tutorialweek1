package mooc.fiw1;
import java.util.Scanner;
public class E15 {
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		int age;
		System.out.println("How old are you: ");
		age = scanner.nextInt();
		
		if(age >= 18){
			System.out.println("You have reached the age of majority!");
		} else{
			System.out.println("You have not reached the age of majority yet!");
		}
	}

}
