package basic;

public class twomatrix {
	public static void main(String[] args) {
		int row =2,column=3;
		int [][] first = {{1,2,3},{4,3,2}};
		int [][] second = {{4,5,6},{7,5,6}};
		
		
		int sum [][] = new int[row][column];
		for(int i=0; i<row;i++) {
			for(int j=0; j<column;j++) {
				sum[i][j]= first[i][j] + second[i][j];
				
			}
			
		}
		
		System.out.println("Sum of two matrices");
		for(int[] rows:sum) {
			for(int columns : rows) {
				System.out.print(columns+"  ");
			}
			System.out.println();
		}
		
		
	}

}
