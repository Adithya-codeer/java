package basic;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class timenowformatted {
	public static void main(String[] args) {
		LocalDateTime current = LocalDateTime.now();
		DateTimeFormatter format = DateTimeFormatter.ofPattern("YYYY-DD-MM  HH-MM-ss-SSS");
		String formatted = current.format(format);
		System.out.print(formatted);
	}

}
