package Functions;

import java.util.Scanner;

public class Ans6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius : ");
        int radius = sc.nextInt();
        area(radius);
        circumference(radius);
    }

    public static void area(int radius) {
        double area = Math.PI * (radius * radius);
        System.out.printf("Area is: %.2f", area);
    }

    public static void circumference(int radius) {
        double circumference = Math.PI * 2 * radius;
        System.out.printf("\nCircumference is: %.2f", circumference);
    }
}
