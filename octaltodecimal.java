package basic;
import java.util.Scanner;
public class octaltodecimal {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number to find its octal:");
		int decimal = scan.nextInt();
		int result = dec2oct(decimal);
		System.out.print("The octal value is :"+result);
	}
	
	public static int dec2oct(int num) {
		int decimal = 0;
		int remainder = 0;
		int i =1;
		int octal = 0;
		
		while(num != 0) {
			remainder = num % 8;
			octal += remainder * i;
			num = num / 8;
			i*=10;
		}
		return octal;
		
		
	}

}
