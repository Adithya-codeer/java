package basic;
import java.util.Scanner;
public class sentencecounting {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the senctence you like:");
		String line = scan.nextLine();
		int vowels=0;
		int consonants = 0;
		int digits = 0;
		int spaces = 0;
		
		for(int i=0; i<line.length();i++) {
			char ch = line.charAt(i);
			
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vowels++;
			}
			else if(ch > 'a' && ch <='z') {
				consonants++;
			}
			else if(ch >= 0 && ch <= 9) {
				digits++;
			}
			else if(ch == ' '){
				spaces++;
			}
		}
		System.out.println(vowels);
		System.out.println(consonants);
		System.out.println(digits);
		System.out.println(spaces);
		
	}

}
