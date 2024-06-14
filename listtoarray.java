package basic;
import java.util.ArrayList;
import java.util.Arrays;
public class listtoarray {
	public static void main(String[] args) {
		//creating arraylist for language
		ArrayList<String> language = new ArrayList<String>();
		//adding the language to the arraylist
		language.add("Python");
		language.add("Java");
		language.add("Kotlin");
		//printing the arraylist
		System.out.println(language);
		//creating arrays
		
		String[] arr = new String[language.size()];
		
		language.toArray(arr);
		
		for(String items : arr) {
			System.out.print(items+" ");
		}
		
		
		
		
		
	}

}
