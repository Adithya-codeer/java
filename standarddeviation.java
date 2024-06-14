package basic;
import java.util.Arrays;
public class standarddeviation {
	public static void main(String[] args) {
		double arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		double sd = stadev(arr);
		System.out.print(sd);
	}
	
	public static double stadev(double arr[]) {
		
		double standarddeviation = 0,sum=0;
		
		double length = arr.length;
		for(double num : arr) {
			sum += num;
		}
		
		double mean = sum/length;
		
		for(double num : arr) {
			num = num-mean;
			standarddeviation += Math.pow(num, 2);
		}
		
		double stande = standarddeviation/length;
		
		stande = Math.sqrt(stande);
		
		return stande;
		
		
		
		
	}

}
