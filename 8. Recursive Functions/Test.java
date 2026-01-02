package recursion;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number for factorial: ");
        int n = sc.nextInt();
        System.out.println("Factorial = " + RecursionTasks.factorial(n));

        System.out.print("Enter number of Fibonacci terms: ");
        int terms = sc.nextInt();
        System.out.print("Fibonacci series: ");
        RecursionTasks.printFibonacci(terms);
        System.out.println();

        System.out.println("Numbers from 100 to 1:");
        RecursionTasks.printReverse(100);

        System.out.println("Print JAVA 100 times:");
        RecursionTasks.printJava(100);

        System.out.print("Enter a word: ");
        String word = sc.next();
        boolean result = RecursionTasks.isPalindrome(word, 0, word.length() - 1);
        System.out.println("Palindrome = " + result);

        sc.close();
    }
}
