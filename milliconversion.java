package basic;
import java.util.Scanner;
public class milliconversion {
	public static void main(String[] args) {
		System.out.println("Welcome to the program where we do millisecond conversion");
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the value for the milliseconds:");
		long milliseconds = scan.nextLong();
		long second = milliseconds/1000;
		long minute = (milliseconds/1000)/60;
		System.out.println("The value for the second is:"+second);
		System.out.println("The value for the minute is:"+minute);
	}

}
