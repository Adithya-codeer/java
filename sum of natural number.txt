package basic;
import java.util.Scanner;

public class naturalsum {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the range upto which you like to find the sum of natural number:");
		int num = scan.nextInt();
		System.out.print(sumnatural(num));
	}
	
	public static int sumnatural(int num) {

		if(num!=0) {
			return num+sumnatural(num-1);
		}
		else {
			return num;
		}
	
	}

}
