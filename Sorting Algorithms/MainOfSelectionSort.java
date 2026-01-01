package selectionSort;

import java.util.Scanner;

public class MainOfSelectionSort {
	 public static void main(String[] args) {
	        int[] numbers = new int[10];
	        
	        Scanner inputScanner = new Scanner(System.in);
	        
	        System.out.println("Enter the elements to sort: ");
	        for(int i =0; i<numbers.length; i++) {
	        	numbers[i] = inputScanner.nextInt();
	        }


	        System.out.println("Before sorting:");
	        for (int n : numbers) {
	            System.out.print(n + " ");
	        }
	        System.out.println("\n");

	        SelectionSorting sorter = new SelectionSorting(numbers);
	        sorter.selectionsort();

	        System.out.println("\nAfter sorting:");
	        for (int n : numbers) {
	            System.out.print(n + " ");
	        }
	 }
}