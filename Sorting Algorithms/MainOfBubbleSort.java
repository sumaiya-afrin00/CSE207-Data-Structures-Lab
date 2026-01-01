package bubbleSort;

import java.util.Scanner;

public class MainOfBubbleSort {

	public static void main(String[] args) {
		 int[] data = new int [10];
		 
		 Scanner inputScanner = new Scanner(System.in);
		 
		 System.out.println("Enter the elements to sort: ");
		 
		 for(int i = 0; i<data.length; i++) {
			 data[i] = inputScanner.nextInt();
		 }
		 
		 
		 System.out.println("Before Sorting: ");
		 
		 for (int n: data) {
			 System.out.print(n + " ");
		 }
		 
		 System.out.println("\n");
		 
		 BubbleSorting sorting = new BubbleSorting(data);
		 sorting.bubbleSort(data.length);
		 
		 System.out.println("\nAfter sorting: ");
		 for(int n : data) {
			 System.out.print(n+" ");
		 }
		 
	}

}
