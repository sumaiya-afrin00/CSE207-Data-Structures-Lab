package labTask3;

public class Sub {
	public void sub(int[][]A, int [][]B, int row, int col) {
		int [][] subs = new int [row][col];
		
		System.out.println("Result of subtraction: ");
		
		for( int i = 0; i< row; i++) {
			for(int j = 0; j<col; j++) {
				subs [i][j] = A[i][j] - B[i][j]; 
				
				System.out.print(subs[i][j]+" ");
			}
			System.out.println();
		}
	}

}
