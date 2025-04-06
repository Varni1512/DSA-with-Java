import java.util.Scanner;

public class Ans4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter num1 : ");
        int num1 = sc.nextInt();
        System.out.print("Enter num2 : ");
        int num2 = sc.nextInt();
        System.out.print("Enter Operator : ");
        String op = sc.next();

        if(op.equals("+")) {
            System.out.println(num1 + num2);
        } else if(op.equals("-")) {
            System.out.println(num1 - num2);
        } else if(op.equals("*")) {
            System.out.println(num1 * num2);
        } else if(op.equals("/")) {
            if(num2 != 0) {
                System.out.println(num1 / num2);
            } else {
                System.out.println("Error: Division by zero is not allowed.");
            }
        } else {
            System.out.println("Invalid operator.");
        }
    }
}
