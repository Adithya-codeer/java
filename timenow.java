package basic;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class timenow {
	public static void main(String[] args) {
		LocalDateTime current = LocalDateTime.now();
		DateTimeFormatter format = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
		String formatted = current.format(format);
		System.out.print(formatted);
	}

}
