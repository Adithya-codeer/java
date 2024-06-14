package basic;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
public class milliseconds {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the value for the milliseconds:");
		long milliseconds = scan.nextLong();
		
		long seconds = TimeUnit.MILLISECONDS.toSeconds(milliseconds);
		System.out.println(seconds);
		
		long minutes = TimeUnit.MILLISECONDS.toMinutes(milliseconds);
		System.out.println(minutes);
		
	}

}
