package mooc.fiw1;
import java.util.Scanner;
public class E18 {
	public static void main(String[] args){
	
		Scanner scanner = new Scanner(System.in);
		System.out.print("Type the point [0-60] : ");
		int i = scanner.nextInt();
		
			if(50<=i && i<=60){
			System.out.println("5");
			}
		
			else if(45<=i && i<=49){
				System.out.println("4");
			}
			
			else if(40<=i && i<=44){
			System.out.println("3");
			}
			
			else if(35<=i && i<=39){
			System.out.println("2");
			}
			
			else if(30<=i && i<=34){
			System.out.println("1");
			}
			
			else{
				System.out.println("failed");			
		}
	}

}
