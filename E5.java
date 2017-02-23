package mooc.fiw1;

public class E5 {
	public static void main(String[] args){
		int seconds = 60;
		int minute = 60;
		int hour = 24;
		int days = 365;
		
		int secondsInAYear = (seconds * minute * hour * days );
		System.out.println("There is " +secondsInAYear +" in a year");
	
	}
}