package basic;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class localizedtime {
	public static void main(String[] args) {
		LocalDateTime current = LocalDateTime.now();
		DateTimeFormatter format = DateTimeFormatter.ofLocalizedDateTime(null);
		String formatted = current.format(format);
		System.out.print(formatted);
		
	}

}
