package Functions;

import java.util.Scanner;

public class Ans5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number : ");
        int first = sc.nextInt();
        System.out.print("Enter Second number : ");
        int second = sc.nextInt();

        int ans = product(first, second);
        System.out.println("Product of Two number is : " + ans);
 
    }

    public static int product(int first, int second) {
        int multi = first * second;
        return multi;
    }
}
