package Functions;

import java.util.Scanner;

public class Ans9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Factorial
        System.out.print("Enter a number to find factorial: ");
        int num = sc.nextInt();
        System.out.println("Factorial of " + num + " is: " + factorial(num));
    }
    public static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        long fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
