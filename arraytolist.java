package basic;
import java.util.ArrayList;
import java.util.Arrays;
public class arraytolist {
	public static void main(String[] args) {
		String [] arr = {"Python","Java","C"};
		
		System.out.println(Arrays.toString(arr));
		
		ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));
		
		
		
		System.out.println(list);
		
	}

}
