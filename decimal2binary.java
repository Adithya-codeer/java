package basic;

import java.util.Scanner;

public class decimal2binary {
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number to find its binary value:");
		int decimal = scan.nextInt();
		String binary = Integer.toBinaryString(decimal);
		System.out.println("The binary number is:"+binary);
	}

}