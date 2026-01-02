package recursion;

public class RecursionTasks {

    static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    static void printFibonacci(int n) {
        if (n == 0) {
            return;
        }
        printFibonacci(n - 1);
        System.out.print(fibonacci(n - 1) + " ");
    }

    static void printReverse(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        printReverse(n - 1);
    }

    static void printJava(int n) {
        if (n == 0) {
            return;
        }
        System.out.println("JAVA");
        printJava(n - 1);
    }

    static boolean isPalindrome(String word, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (word.charAt(start) != word.charAt(end)) {
            return false;
        }
        return isPalindrome(word, start + 1, end - 1);
    }
}
