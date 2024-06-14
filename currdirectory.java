package basic;
import java.nio.file.Paths;
public class currdirectory {
	public static void main(String[] args) {
		String path = Paths.get("").toAbsolutePath().toString();
		System.out.println("Your current working directory:"+path);
	}

}
