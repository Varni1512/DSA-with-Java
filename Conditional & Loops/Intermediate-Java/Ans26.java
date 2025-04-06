import java.util.Scanner;

public class Ans26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int sumNegative = 0, sumEven = 0, sumOdd = 0;

        while (true) {
            num = sc.nextInt();
            if (num == 0)
                break;
            if (num < 0)
                sumNegative += num;
            else if (num % 2 == 0)
                sumEven += num;
            else
                sumOdd += num;
        }

        System.out.println("Sum of Negative Numbers: " + sumNegative);
        System.out.println("Sum of Positive Even Numbers: " + sumEven);
        System.out.println("Sum of Positive Odd Numbers: " + sumOdd);
        sc.close();
    }
}
