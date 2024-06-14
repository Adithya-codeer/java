package basic;

public class currentdirectory {
	public static void main(String[] args) {
		String path = System.getProperty("user.dir");
		System.out.println("Your current working directory is:"+path);
	}

}
