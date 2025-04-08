package Functions;

import java.util.Scanner;

public class Ans10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter a number to check if it's a palindrome: ");
        int palindromeNum = sc.nextInt();
        System.out.println(palindromeNum + (isPalindrome(palindromeNum) ? " is" : " is not") + " a palindrome.");
    }
    public static boolean isPalindrome(int number) {
        int original = number, reversed = 0;
        while (number > 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        return original == reversed;
    }
}
