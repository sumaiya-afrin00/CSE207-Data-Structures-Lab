package labTask3;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the size of row: ");
		int row = input.nextInt();
		
		System.out.println("Enter the size of col: ");
		int col = input.nextInt();
		
		int [][]A = new int [row] [col];
		int [][]B = new int [row] [col];
		
		System.out.println("Enter A: ");
		for(int i = 0; i<row; i++) {
			for(int j = 0; j<col; j++) {
				A[i][j] = input.nextInt();
			}
		}
		
		System.out.println("Enter B: ");
		for(int i = 0; i<row; i++) {
			for(int j = 0; j<col; j++) {
				B[i][j] = input.nextInt();
			}
		}
		
		Addition addition = new Addition();
		addition.addition(A, B, row, col);
		
		Sub subs = new Sub();
		subs.sub(A, B, row, col);
		
		Multiplication multiplication = new Multiplication();
		multiplication.multi(A, B, col, col, row, col);
		
		Transpose trans = new Transpose();
		trans.transpose(A, row, col);
		
		
	}

}
