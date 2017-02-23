package mooc.fiw1;

import java.util.Scanner;
public class E10 {
	public static void main (String[] args){
		
		//final float PI = (float) 3.141592653589793;
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Type the radius: "); //enter string
		int radius = Integer.parseInt(scanner.nextLine());
		
		double cCircle = 2 * Math.PI * radius; //circumference
		System.out.println("Circumference of a cirlce " +radius +" is = " +cCircle);
	}

}
