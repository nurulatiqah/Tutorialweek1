package mooc.fiw1;

import java.util.Scanner;

//import java.util.Scanner;

public class E19 {
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		System.out.print("How old are you?: ");
		int age= scanner.nextInt();
		
		if(age>0 && age<=120){
			System.out.println("OK");
		}
		else if(age<0 || age>=121){
			System.out.println("Impossible!");
		}
		//else{
			//System.out.println("Impossible!");
		}
	}

