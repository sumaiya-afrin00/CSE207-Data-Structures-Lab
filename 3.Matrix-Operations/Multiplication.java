package labTask3;

public class Multiplication {
	public void multi(int [][]A, int [][]B, int r1, int c1, int r2, int c2) {
		int[][] result = new int [r1][c2];
		
		System.out.println("Result of multiplication: ");
		
		for(int i = 0; i<r1; i++) {
			for(int j = 0; j<c2; j++) {
				result[i][j] = 0;
				
				for(int k = 0; k<c1; k++) {
					result [i][j] = result [i][j] + (A[i][j]* B[i][j]);
				}
				System.out.print(result[i][j]+" ");
			}
			System.out.println();
		}
	}

}
