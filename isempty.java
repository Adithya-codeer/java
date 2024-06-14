package basic;
import java.util.Scanner;
public class isempty {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the sentence for the first:");
		String a = scan.nextLine();
		System.out.print("Enter the sentence for the second:");
		String b = scan.nextLine();
		//System.out.println("Enter the sentence for the third:");
		String c = null;
		System.out.println("The first entered sentence is:"+isempt(a));
		System.out.println("The second entered sentence is:"+isempt(b));
		System.out.println("The third entered sentence is:"+isempt(c));
		scan.close();
	}
		
		public static String isempt(String str) {
			if(str==null) {
				return "NULL";
			}
			else if(str.isEmpty()) {
				return "EMPTY";
			}
			
			else {
				return "Neither null or empty";
			}
			
	
		
		
	}
	

}
