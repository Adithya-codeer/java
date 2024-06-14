package basic;
import java.util.Scanner;

public class substring {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String sent = scan.nextLine();
		String reversed = reverse(sent);
		System.out.println(reversed);
		
	}
	
	public static String reverse(String sent) {
		if(sent.isEmpty())
			return sent;
		
		return reverse(sent.substring(0)) + sent.charAt(0);
	}
}
