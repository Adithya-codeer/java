package basic;
import java.util.ArrayList;
import java.util.List;
public class joinlist {
	public static void main(String[] args) {
	    List<String> list1 = new ArrayList<String>();
		List<String> list2 = new ArrayList<String>();
		
		list1.add("A");
		list2.add("B");
		
		List<String> joined = new ArrayList<String>();
		
		joined.addAll(list1);
		joined.addAll(list2);
		
		System.out.println(list1);
		System.out.println(list2);
		System.out.println(joined);
		
		
	}

}
