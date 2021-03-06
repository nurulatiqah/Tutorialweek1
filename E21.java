package mooc.fiw1;
/*A year is a leap year if it is divisible by 4. But if the year is divisible by 100, 
it is a leap year only when it is also divisible by 400*/

import java.util.Scanner;
public class E21 {
	public static void main(String[] args){
		
		int year;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a year: ");
		year = scanner.nextInt();
		
		if (((year % 4 == 0) && (year% 100 !=0)) || (year % 400==0)){
			System.out.println("The year is a leap year");
		}
		else{
			System.out.println("The year is not a leap year");
		}
	}
}
