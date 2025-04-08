package Functions;

import java.util.Scanner;

public class Ans4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number : ");
        int first = sc.nextInt();
        System.out.print("Enter Second number : ");
        int second = sc.nextInt();

        int ans = sum(first, second);
        System.out.println("SUm of Two number is : " + ans);

    }

    public static int sum(int first, int second) {
        int sum = first + second;
        return sum;
    }
}
