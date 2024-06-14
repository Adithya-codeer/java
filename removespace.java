package basic;
import java.util.Scanner;

public class removespace {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a sentence you like:");
		String str = scan.nextLine();
		scan.close();
		System.out.println(str);
		
		String sent = str.replaceAll("\\s","");
		System.out.println(sent);
		
	}

}
