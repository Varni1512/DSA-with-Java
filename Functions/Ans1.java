package Functions;

import java.util.Scanner;

class Ans1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number : ");
        int first = sc.nextInt();
        System.out.print("Enter Second number : ");
        int second = sc.nextInt();
        System.out.print("Enter Third number : ");
        int third = sc.nextInt();

        int largest = largest(first, second, third);
        int smallest = smallest(first, second, third);
 
        System.out.printf("largest of three numbers %d, %d, and %d is : %d %n",
                                   first, second, third, largest);
        System.out.printf("smallest of three numbers %d, %d, and %d is : %d %n", 
                               first, second, third, smallest);
 
    }

    public static int largest(int first, int second, int third) {
        int max = first;
        if (second > max) {
            max = second;
        }

        if (third > max) {
            max = third;
        }

        return max;
    }

    public static int smallest(int first, int second, int third) {
        int min = first;
        if (second < min) {
            min = second;
        }

        if (third < min) {
            min = third;
        }

        return min;
    }
}