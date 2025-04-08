package Functions;

import java.util.Scanner;

public class Ans12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter lower and upper bounds to find prime numbers: ");
        int low = sc.nextInt();
        int high = sc.nextInt();
        System.out.println("Prime numbers between " + low + " and " + high + " are:");
        printPrimesBetween(low, high);
    }
    public static void printPrimesBetween(int low, int high) {
        for (int i = low; i <= high; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    private static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
