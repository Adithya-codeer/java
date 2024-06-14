package basic;

public class average {
	public static void main(String[] args) {
		double[] numarray = {45.3, 67.5, -45.6, 20.34, 33.0, 45.6 };
		double sum =0;
		
		for(double num : numarray) {
			sum += num;
		}
		
		double average = sum/numarray.length;
		
		System.out.format("%.2f",average);
	}

}
