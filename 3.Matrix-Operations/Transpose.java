package labTask3;

public class Transpose {
	public void transpose(int [][]A, int row,int col) {
		int [][] trans = new int [col][row];
		
		System.out.println("Result of Transpose: ");
		
		for(int i = 0; i<row; i++) {
			for(int j = 0; j<col; j++) {
				trans[j][i] = A[i][j];
			}
		}
		
		for(int i = 0; i<col; i++) {
			for(int j = 0; j<row; j++) {
				System.out.print(trans[i][j]+" ");
			}
			System.out.println();
		}
	}

}
