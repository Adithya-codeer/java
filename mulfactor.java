package basic;
import java.util.Scanner;

public class mulfactor {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number to find its factorial:");
		int num = scan.nextInt();
		System.out.print(factmult(num));
		
	}
	
	public static int factmult(int num) {
		if(num != 0) {
			return num * factmult(num-1);
		}
		else {
			return 1;
		}
	}

}
