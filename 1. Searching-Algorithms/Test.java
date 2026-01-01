package searchingAlgorithms;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] data = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            data[i] = sc.nextInt();
        }

        System.out.print("Enter item to search: ");
        int item = sc.nextInt();

        LinearSearch ls = new LinearSearch();
        System.out.println("\nLinear Search Result:");
        ls.search(data, item);
        
        BinarySearch bs = new BinarySearch();
        System.out.println("\nBinary Search Result:");
        bs.search(data, item);
    }
}
