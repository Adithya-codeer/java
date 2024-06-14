package basic;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class stringtodate {
	public static void main(String[] args) {
		String string = "2017-12-12";
		LocalDate date = LocalDate.parse(string,DateTimeFormatter.ISO_DATE);
		System.out.print(date);
	}

}
