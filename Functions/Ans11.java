package Functions;

import java.util.Scanner;

public class Ans11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter three numbers to check for Pythagorean triplet: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println((isPythagoreanTriplet(a, b, c) ? "Yes, it's" : "No, it's not") + " a Pythagorean triplet.");
    }
    public static boolean isPythagoreanTriplet(int a, int b, int c) {
        int x = Math.max(a, Math.max(b, c));
        int y, z;
        if (x == a) {
            y = b;
            z = c;
        } else if (x == b) {
            y = a;
            z = c;
        } else {
            y = a;
            z = b;
        }
        return x * x == y * y + z * z;
    }

}
