package labTask3;

public class Addition {
	public void addition(int [][]A, int [][]B, int row, int col) {
		int[][] sum = new int [row][col];
		System.out.println("Result of Addition: ");
		
		for(int i = 0; i<row; i++) {
			for(int j = 0; j<col; j++) {
				sum[i][j] = A[i][j] + B[i][j];
				
				System.out.print(sum[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
