package basic;
import java.util.Scanner;

public class factors {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Choose the operator for calculation(*,+,-,%,/):");
		char operator = scan.next().charAt(0);
		System.out.print("Enter the first value:");
		double num1 = scan.nextDouble();
		System.out.print("Enter the second value:");
		double num2 = scan.nextDouble();
		double result;
		
		switch (operator) {
		case '+':
			result = num1 + num2;
			System.out.println("Sum of two numbers:"+result);
			break;
		case '-':
			result = num1 - num2;
			System.out.println("Difference of two numbers:"+result);
			break;
		case '*':
			result = num1 * num2;
			System.out.println("Multiplication of two numbers:"+result);
			break;
		case '/':
			result = num1 / num2;
			System.out.println("Division of two numbers:"+result);
			break;
			
		default:
			System.out.println("Invalid");
		}
		
		
		

	}

}
