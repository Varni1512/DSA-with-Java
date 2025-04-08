package Functions;

import java.util.Scanner;

public class Ans13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter a number to find the sum of first n natural numbers: ");
        int n = sc.nextInt();
        System.out.println("Sum of first " + n + " natural numbers is: " + sumOfNaturalNumbers(n));

    }
    public static int sumOfNaturalNumbers(int n) {
        return n * (n + 1) / 2;
    }
}
