package basic;
import java.util.Scanner;
public class frequency {
	public static void main(String[] args) {
		System.out.println("Welcome to the program where we will find the frequency of the character in the sentence");
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the sentece:");
		String str = scan.nextLine();
		char ch = 'h';
		int frequency = 0;
		
		for(int i=0; i<str.length(); i++) {
			if(ch==str.charAt(i)) {
				frequency++;
			}
			
			
		}
		System.out.println(frequency);

		
	}

}
