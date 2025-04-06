import java.util.Scanner;

public class Ans9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter lower bound: ");
        int lower = sc.nextInt();
        System.out.print("Enter upper bound: ");
        int upper = sc.nextInt();

        System.out.println("Armstrong numbers between " + lower + " and " + upper + " are:");

        for (int num = lower; num <= upper; num++) {
            int originalNum = num, sum = 0;
            int digits = String.valueOf(num).length();

            while (originalNum != 0) {
                int digit = originalNum % 10;
                sum += Math.pow(digit, digits);
                originalNum /= 10;
            }

            if (sum == num) {
                System.out.println(num);
            }
        }
    }
}
