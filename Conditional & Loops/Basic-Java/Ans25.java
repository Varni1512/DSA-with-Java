import java.util.Scanner;

public class Ans25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE, num;
        do {
            System.out.print("Enter number: ");
            num = sc.nextInt();
            if (num > max && num != 0)
                max = num;
        } while (num != 0);
        System.out.println("Largest = " + max);
    }
}